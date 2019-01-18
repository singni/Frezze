package com.frezze.controller;

import com.frezze.domain.Contract;
import com.frezze.domain.ContractProduct;
import com.frezze.domain.ContractProductExample;
import com.frezze.mapper.ContractMapper;
import com.frezze.mapper.ContractProductMapper;
import com.frezze.service.ContractService;
import com.frezze.utils.UtilFuns;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Rian on 2019/1/7.
 * Copyright © 2018 Rian. All rights reserved
 */
@Controller
public class OutPrintContRoller {
    @Autowired
    private ContractService contractService;

    @Autowired
    private ContractProductMapper contractProductMapper;


    @RequestMapping("/contract/ContractDownload")
    public ResponseEntity<byte[]> printNotTemplate(Date date) throws Exception {
        //1.创建工作簿
        Workbook wb = new SXSSFWorkbook();

        //2.创建工作表
        Sheet sheet = wb.createSheet();

        //设置列宽   本身就是bug
        sheet.setColumnWidth(0, 3 * 256);
        sheet.setColumnWidth(1, 26 * 256);
        sheet.setColumnWidth(2, 11 * 256);
        sheet.setColumnWidth(3, 29 * 256);
        sheet.setColumnWidth(4, 12 * 256);
        sheet.setColumnWidth(5, 15 * 256);
        sheet.setColumnWidth(6, 10 * 256);
        sheet.setColumnWidth(7, 10 * 256);
        sheet.setColumnWidth(8, 8 * 256);


        //抽取出一些公用变量
        Row nRow = null;
        Cell nCell = null;

        int rowNo = 0;//行号
        int cellNo = 1;//列号

        //3.创建行对象
        //==========================================大标题的制作
        nRow = sheet.createRow(rowNo++);//创建行对象
        nRow.setHeightInPoints(36.26f);//设置行高
        nCell = nRow.createCell(cellNo);

        //设置单元格的内容
        nCell.setCellValue(new SimpleDateFormat("yyyy-MM-dd").format(date) + "  出货表");
        //设置单元格样式
        nCell.setCellStyle(bigTitle(wb));

        //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 1, 8));


        //============================================ 小标题
        nRow = sheet.createRow(rowNo++);//创建行对象
        nRow.setHeightInPoints(26f);//设置行高

        String titles[] = {"客户", "订单号", "货号", "数量", "工厂", "工厂交期", "船期", "贸易条款"};
        for (String title : titles) {
            nCell = nRow.createCell(cellNo++);//创建小标题上的单元格

            nCell.setCellValue(title);//设置单元格内容
            nCell.setCellStyle(this.title(wb));//小标题样式的设置
        }


        //===========================================数据内容
        List<Contract> contracts = contractService.findContractByShipDate(date);
        for(Contract contract:contracts){
            ContractProductExample exam=new ContractProductExample();
            exam.createCriteria().andContractIdEqualTo(contract.getContractId());
            List<ContractProduct> products = contractProductMapper.selectByExample(exam);
            for(ContractProduct cp :products){
                //产生一个新行
                nRow = sheet.createRow(rowNo++);
                nRow.setHeightInPoints(24f);//设置行高

                cellNo=1;

                //产生单元格   客户
                nCell = nRow.createCell(cellNo++);//创建单元格
                nCell.setCellValue(contract.getCustomName());//设置单元格内容
                nCell.setCellStyle(text(wb));    //设置单元格样式

                //产生单元格订单号
                nCell = nRow.createCell(cellNo++);//创建单元格
                nCell.setCellValue(contract.getContractNo());//设置单元格内容
                nCell.setCellStyle(text(wb));    //设置单元格样式

                //产生单元格货号
                nCell = nRow.createCell(cellNo++);//创建单元格
                nCell.setCellValue(cp.getProductNo());//设置单元格内容
                nCell.setCellStyle(text(wb));    //设置单元格样式

                //产生单元格数量
                nCell = nRow.createCell(cellNo++);//创建单元格
                nCell.setCellValue(cp.getCnumber());//设置单元格内容
                nCell.setCellStyle(text(wb));    //设置单元格样式

                //产生单元格工厂
                nCell = nRow.createCell(cellNo++);//创建单元格
                nCell.setCellValue(cp.getFactoryName());//设置单元格内容
                nCell.setCellStyle(text(wb));    //设置单元格样式

                //产生单元格工厂交期
                nCell = nRow.createCell(cellNo++);//创建单元格
                nCell.setCellValue(UtilFuns.dateTimeFormat(contract.getDeliveryPeriod()));//设置单元格内容
                nCell.setCellStyle(text(wb));    //设置单元格样式

                //产生单元格船期
                nCell = nRow.createCell(cellNo++);//创建单元格
                nCell.setCellValue(UtilFuns.dateTimeFormat(contract.getShipTime()));//设置单元格内容
                nCell.setCellStyle(text(wb));    //设置单元格样式


                //产生单元格贸易条款
                nCell = nRow.createCell(cellNo++);//创建单元格
                nCell.setCellValue(contract.getTradeTerms());//设置单元格内容
                nCell.setCellStyle(text(wb));    //设置单元格样式

            }
        }
        //遍历货物列表


        //输出
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();//内存的缓冲区
        wb.write(byteArrayOutputStream);

        //提供response对象
        HttpHeaders headers = new HttpHeaders();
        //下载显示的文件名，解决中文名称乱码问题
        String downloadFielName = new String("a.xlsx".getBytes("UTF-8"),"iso-8859-1");
        //通知浏览器以attachment（下载方式）打开图片
        headers.setContentDispositionFormData("attachment", downloadFielName);
        //application/octet-stream ： 二进制流数据（最常见的文件下载）。
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(byteArrayOutputStream.toByteArray(),
                headers, HttpStatus.CREATED);
    }

    //大标题的样式
    public CellStyle bigTitle(Workbook wb){
        CellStyle style = wb.createCellStyle();
        Font font = wb.createFont();
        font.setFontName("宋体");
        font.setFontHeightInPoints((short)16);
        font.setBoldweight(Font.BOLDWEIGHT_BOLD);					//字体加粗

        style.setFont(font);

        style.setAlignment(CellStyle.ALIGN_CENTER);					//横向居中
        style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);		//纵向居中

        return style;
    }
    //小标题的样式
    public CellStyle title(Workbook wb){
        CellStyle style = wb.createCellStyle();
        Font font = wb.createFont();
        font.setFontName("黑体");
        font.setFontHeightInPoints((short)12);

        style.setFont(font);

        style.setAlignment(CellStyle.ALIGN_CENTER);					//横向居中
        style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);		//纵向居中

        style.setBorderTop(CellStyle.BORDER_THIN);					//上细线
        style.setBorderBottom(CellStyle.BORDER_THIN);				//下细线
        style.setBorderLeft(CellStyle.BORDER_THIN);					//左细线
        style.setBorderRight(CellStyle.BORDER_THIN);				//右细线

        return style;
    }

    //文字样式
    public CellStyle text(Workbook wb){
        CellStyle style = wb.createCellStyle();
        Font font = wb.createFont();
        font.setFontName("Times New Roman");
        font.setFontHeightInPoints((short)10);

        style.setFont(font);

        style.setAlignment(CellStyle.ALIGN_LEFT);					//横向居左
        style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);		//纵向居中

        style.setBorderTop(CellStyle.BORDER_THIN);					//上细线
        style.setBorderBottom(CellStyle.BORDER_THIN);				//下细线
        style.setBorderLeft(CellStyle.BORDER_THIN);					//左细线
        style.setBorderRight(CellStyle.BORDER_THIN);				//右细线

        return style;
    }

}

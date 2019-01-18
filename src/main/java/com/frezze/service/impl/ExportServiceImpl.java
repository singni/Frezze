package com.frezze.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.frezze.domain.*;
import com.frezze.mapper.*;
import com.frezze.service.ExportService;
import com.frezze.utils.UtilFuns;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by Rian on 2019/1/12.
 * Copyright © 2018 Rian. All rights reserved
 */
@Service
public class ExportServiceImpl  implements ExportService{
    @Autowired
    private ContractMapper contractMapper;
    @Autowired
    private ContractProductMapper contractProductMapper;
    @Autowired
    private ExtCproductMapper extCproductMapper;
    @Autowired
    private ExportMapper exportMapper;
    @Autowired
    private ExportProductMapper exportProductMapper;
    @Autowired
    private ExtEproductMapper extEproductMapper;

    public void addExport(Export export) {

        export.setExportId(UUID.randomUUID().toString());
        export.setState(0);
        String ids [] = export.getContractIds().split(",");
        StringBuilder sb  = new StringBuilder();

        for(String id :ids){
            Contract contract = contractMapper.selectByPrimaryKey(id);
            contract.setState(2);  //修改状态
            contractMapper.updateByPrimaryKey(contract);

            sb.append(contract.getContractNo()).append(" ");
        }
        export.setCustomerContract(sb.toString());//设置合同及确认书号
        export.setContractIds(UtilFuns.joinStr(ids, ","));
        export.setInputDate(new Date());//设置制单日期
        ContractProductExample cpexam=new ContractProductExample();
        cpexam.createCriteria().andContractIdIn(Arrays.asList(ids));
        export.setCreateTime(new Date());
        exportMapper.insert(export);
        List<ContractProduct> products = contractProductMapper.selectByExample(cpexam);
        for(ContractProduct cp:products){
            ExportProduct exte=new ExportProduct();
            exte.setExportProductId(cp.getContractProductId());
            exte.setExportId(export.getExportId());
            exte.setBoxNum(cp.getBoxNum());
            exte.setCnumber(cp.getCnumber());
            exte.setFactoryId(cp.getFactoryId());
            exte.setOrderNo(cp.getOrderNo());
            exte.setPackingUnit(cp.getPackingUnit());
            exte.setPrice(cp.getPrice());
            exte.setProductNo(cp.getProductNo());
            exportProductMapper.insert(exte);
            ExtCproductExample extam=new ExtCproductExample();
            extam.createCriteria().andContractProductIdEqualTo(cp.getContractProductId());
            List<ExtCproduct> extCproducts = extCproductMapper.selectByExample(extam);
            for(ExtCproduct ec:extCproducts){
                ExtEproduct extEproduct=new ExtEproduct();
                BeanUtils.copyProperties(extEproduct,ec);
                extEproduct.setExtEproductId(ec.getExtCproductId());
                extEproduct.setExportProductId(exte.getExportProductId());
                extEproduct.setFactoryId(exte.getFactoryId());
                extEproductMapper.insert(extEproduct);
            }
        }
    }

    public String findExportByList(int pageNumber, int pageSize, Export export) {

        PageHelper.startPage(pageNumber, pageSize);

        ExportExample exam=new ExportExample();
        List<Export> exports = exportMapper.selectByExample(exam);
        PageInfo pageInfo = new PageInfo(exports);
        long total = pageInfo.getTotal();
        PageIndex pageIndex = new PageIndex();
        pageIndex.setTotal(total);
        pageIndex.setRows(exports);
        return JSONObject.toJSONString(pageIndex, SerializerFeature.DisableCircularReferenceDetect);


    }

    public Export findExportById(String id) {

        return exportMapper.selectByPrimaryKey(id);
    }


}

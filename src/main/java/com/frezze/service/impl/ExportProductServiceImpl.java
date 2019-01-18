package com.frezze.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.frezze.domain.*;
import com.frezze.mapper.ExportProductMapper;
import com.frezze.service.ExportProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rian on 2019/1/16.
 * Copyright © 2018 Rian. All rights reserved
 */
@Service
public class ExportProductServiceImpl implements ExportProductService{
    @Autowired
    private ExportProductMapper exportProductMapper;


    public String findExportByList(int pageNumber, int pageSize, ExportProduct export) {

        PageHelper.startPage(pageNumber, pageSize);
        ExportProductExample exam=new ExportProductExample();
        exam.createCriteria().andExportIdEqualTo(export.getExportId());
        List<ExportProduct> exports = exportProductMapper.selectByExample(exam);
        PageInfo pageInfo = new PageInfo(exports);
        long total = pageInfo.getTotal();
        PageIndex pageIndex = new PageIndex();
        pageIndex.setTotal(total);
        pageIndex.setRows(exports);
        return JSONObject.toJSONString(pageIndex, SerializerFeature.DisableCircularReferenceDetect);

    }

    public void updateExportProduct(ExportProduct exportProduct) {

        exportProductMapper.updateByPrimaryKeySelective(exportProduct);
    }
}

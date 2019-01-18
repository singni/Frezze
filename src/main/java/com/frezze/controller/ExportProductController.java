package com.frezze.controller;

import com.frezze.domain.ExportProduct;
import com.frezze.service.ExportProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Rian on 2019/1/16.
 * Copyright © 2018 Rian. All rights reserved
 */
@Controller
public class ExportProductController {
    @Autowired
    private ExportProductService exportProductService;

    @RequestMapping("/export/findExportProductList")
    @ResponseBody
    public String findExportByList(@RequestParam(required = true, defaultValue = "1") int pageNumber, @RequestParam(required = true, defaultValue = "10") int pageSize, ExportProduct export) {
        return exportProductService.findExportByList(pageNumber, pageSize, export);
    }


    @RequestMapping("/export/updateByExportProduct")
    public String updateByExport(ExportProduct exportProduct){
         exportProductService.updateExportProduct(exportProduct);
        return "/extprot/list";
    }
}

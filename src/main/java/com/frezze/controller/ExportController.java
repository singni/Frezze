package com.frezze.controller;

import com.frezze.domain.DeptP;
import com.frezze.domain.Export;
import com.frezze.service.ExportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Rian on 2019/1/12.
 * Copyright © 2018 Rian. All rights reserved
 */
@Controller
public class ExportController {
    @Autowired
    private ExportService exportService;

    @RequestMapping("/export/addExport")
    public String addExport(Export export){


    exportService.addExport(export);
        return "/export/list";
    }
    @RequestMapping("/export/findExportList")
    @ResponseBody
    public String findExportByList(@RequestParam(required=true,defaultValue="1") int pageNumber, @RequestParam(required=true,defaultValue="10")int pageSize , Export export){
        return  exportService.findExportByList(pageNumber,pageSize,export);
    }

    @RequestMapping("/export/findExporyById/{id}")
    @ResponseBody
    public Export findExportById(@PathVariable String id){
        return  exportService.findExportById(id);
    }
}

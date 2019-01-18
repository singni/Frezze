package com.frezze.controller;

import com.frezze.domain.ContractProduct;
import com.frezze.domain.ExtCproduct;
import com.frezze.domain.PageIndex;
import com.frezze.service.ExtCproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Rian on 2018/12/27.
 * Copyright © 2018 Rian. All rights reserved
 */
@Controller
public class ExtCproductController {
    @Autowired
    private ExtCproductService extCproductService;

    @RequestMapping("/contract/findExtCproductByList")
    @ResponseBody
    public PageIndex findExtCproductByList(@RequestParam(required = true, defaultValue = "1") int pageNumber,
                                               @RequestParam(required = true, defaultValue = "10") int pageSize, ExtCproduct extCproduct) {
        return extCproductService.findExtCproductByList(pageNumber, pageSize, extCproduct);
    }
    @RequestMapping("/contract/addExtCproduct")
    public String addExtCproduct(ExtCproduct extCproduct){
         extCproductService.addExtCproduct(extCproduct);
        return "/cantrace/product";
    }
    @RequestMapping("/contract/deleteExtCproduct/{id}")
    public String  deleteExtCproduct(@PathVariable String  id){
        extCproductService.deleteByExtCproduct(id);
        return "/cantrace/product";
    }


}

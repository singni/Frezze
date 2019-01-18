package com.frezze.controller;

import com.frezze.domain.Contract;
import com.frezze.domain.ContractProduct;
import com.frezze.domain.PageIndex;
import com.frezze.service.ContractProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Rian on 2018/12/26.
 * Copyright © 2018 Rian. All rights reserved
 */
@Controller
public class ContractProduceController {
    @Autowired
    private ContractProduceService produceService;

    @RequestMapping("/contract/findContractProduceByList")
    @ResponseBody
    public PageIndex findContractProduceByList(@RequestParam(required = true, defaultValue = "1") int pageNumber,
                                               @RequestParam(required = true, defaultValue = "10") int pageSize, ContractProduct product) {
        return produceService.findContractProduceByList(pageNumber, pageSize, product);
    }

    @RequestMapping("/ContractProduce/add")
    public String addByContractProduce(ContractProduct product) {
        produceService.addByContractProduce(product);

        return "/cantrace/product";
    }



    @RequestMapping("/ContractProduce/delete/{id}")
    public String delByContractProduce(@PathVariable  String id) {
       produceService.delByContractProduce(id);
        return "/cantrace/product";
    }
}

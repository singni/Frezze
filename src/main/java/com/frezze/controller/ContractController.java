package com.frezze.controller;

import com.frezze.domain.Contract;
import com.frezze.domain.ContractProduct;
import com.frezze.domain.PageIndex;
import com.frezze.service.ContractService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Rian on 2018/12/24.
 * Copyright © 2018 Rian. All rights reserved
 */
@Controller
public class ContractController {
    @Autowired
    private ContractService contractService;

    @RequestMapping("/contract/findContractByList")
    @ResponseBody
    public PageIndex findContractByList(@RequestParam(required = true, defaultValue = "1") int pageNumber,
                                        @RequestParam(required = true, defaultValue = "10") int pageSize, Contract contract) {
        return contractService.findContractByList(pageNumber, pageSize, contract);
    }

    @RequestMapping("/contract/add")
    public String addByContract(Contract contract){
        contractService.addByContract(contract);

        return "/cantrace/list";
    }
    @RequestMapping("/contract/updateByContract")
    public String deleteByCproduct(Contract contract){
        contractService.updateByContract(contract);
        return "/cantrace/list";
    }
    @RequestMapping("/catract/findContractById/{id}")
    @ResponseBody
    public Contract findContractById(@PathVariable  String id){
       return contractService.findContractById(id);
    }


    @RequestMapping("/contract/deleteByContract/{id}")
    public String deleteByContract(@PathVariable String  id){
        contractService.deleteByContract(id);
        return "/cantrace/list";
    }


    @RequestMapping("/contract/findContractByListStatus")
    @ResponseBody
    public PageIndex findContractByListStatus(@RequestParam(required = true, defaultValue = "1") int pageNumber,
                                        @RequestParam(required = true, defaultValue = "10") int pageSize, Contract contract) {
        return contractService.findContractByListStatus(pageNumber, pageSize, contract);
    }


}

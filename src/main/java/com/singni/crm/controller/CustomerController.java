package com.singni.crm.controller;

import com.alibaba.fastjson.JSONObject;
import com.singni.crm.domain.Customer;
import com.singni.crm.domain.PageIndex;
import com.singni.crm.service.CustomerService;
import javafx.beans.DefaultProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Rian on 2018/11/27.
 * Copyright © 2018 Rian. All rights reserved
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customer/findCustomerById")
    public Customer findCustomerById(String id) {
        return customerService.getCustomer(id);
    }
    @RequestMapping("/customer/save")
    public String saveCustomer(Customer customer){
        customerService.saveCustomer(customer);
        return "/customer/list";
    }
    @RequestMapping("/customer/findCustomerByList")
    @ResponseBody
    public String findCustomerByList(String Search, String order, @RequestParam(required=true,defaultValue="0")int offset ,@RequestParam(required=true,defaultValue="10") int limit){

        PageIndex pageIndex = customerService.selectByList(offset, limit);

        return JSONObject.toJSONString(pageIndex);

    }
}

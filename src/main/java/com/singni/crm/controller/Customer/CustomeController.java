package com.singni.crm.controller.Customer;

import com.singni.crm.domain.Customer;
import com.singni.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rian on 2018/11/25.
 * Copyright © 2018 Rian. All rights reserved
 */
@Controller
public class CustomeController {

@Autowired
private CustomerService service;

@RequestMapping("/customer/save")
public String saveCustomer(Customer customer){
    service.saveCustomer(customer);
    return "/customer/list";
}

}

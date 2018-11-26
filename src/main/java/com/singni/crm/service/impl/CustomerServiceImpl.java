package com.singni.crm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.singni.crm.domain.Customer;
import com.singni.crm.domain.CustomerExample;
import com.singni.crm.domain.PageIndex;
import com.singni.crm.mapper.CustomerMapper;
import com.singni.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by Rian on 2018/11/25.
 * Copyright © 2018 Rian. All rights reserved
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    public Customer getCustomer(String id) {
        return null;
    }

    public List<Customer> getCustomerByList(String id) {
        return null;
    }

    public void saveCustomer(Customer customer) {
        customer.setId(UUID.randomUUID().toString());
        customerMapper.insert(customer);
    }

    public PageIndex selectByList(int index, int rows){
       PageHelper.offsetPage(index,rows);

        CustomerExample exam=new CustomerExample();
        List<Customer> customers = customerMapper.selectByExample(exam);
        PageInfo pageInfo=new PageInfo(customers);
        long total = pageInfo.getTotal();
        PageIndex pageIndex=new PageIndex();
        pageIndex.setTotal(total);
        pageIndex.setRows(customers);
        return pageIndex;
    }
}

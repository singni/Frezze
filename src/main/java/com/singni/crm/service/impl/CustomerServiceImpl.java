package com.singni.crm.service.impl;

import com.singni.crm.dao.CustomerDao;
import com.singni.crm.domain.Customer;
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
    private CustomerDao customerDao;

    public Customer getCustomer(String id) {
        return null;
    }

    public List<Customer> getCustomerByList(String id) {
        return null;
    }

    public void saveCustomer(Customer customer) {
        customer.setId(UUID.randomUUID().toString());
     customerDao.saveCustomer(customer);
    }
}

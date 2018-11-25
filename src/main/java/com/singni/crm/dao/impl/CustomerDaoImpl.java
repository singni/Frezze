package com.singni.crm.dao.impl;

import com.singni.crm.dao.CustomerDao;
import com.singni.crm.domain.Customer;
import com.singni.crm.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Rian on 2018/11/25.
 * Copyright © 2018 Rian. All rights reserved
 */
@Repository
public class CustomerDaoImpl implements CustomerDao{

    @Autowired
    private CustomerMapper customerMapper;

    public Customer getCustomer(String id){
        return customerMapper.selectByPrimaryKey(id);
    }

    public List<Customer> getCustomerByList(String id) {
        return null;
    }

    public void saveCustomer(Customer customer) {
     customerMapper.insert(customer);
    }


}

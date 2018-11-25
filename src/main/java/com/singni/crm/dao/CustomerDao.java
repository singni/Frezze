package com.singni.crm.dao;

import com.singni.crm.domain.Customer;

import java.util.List;

/**
 * Created by Rian on 2018/11/25.
 * Copyright © 2018 Rian. All rights reserved
 */
public interface CustomerDao {


    /**
     * 获取一个客户
     * @param id
     * @return Customer
     */
    public Customer getCustomer(String id);

    /**
     * 获取多个客户
     * @param id
     * @return List
     */
    public List<Customer> getCustomerByList(String id);

    /**
     * 保存客户
     * @param customer
     */
    public void saveCustomer(Customer customer);
}

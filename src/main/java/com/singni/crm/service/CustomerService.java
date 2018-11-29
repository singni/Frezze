package com.singni.crm.service;

import com.singni.crm.domain.Customer;
import com.singni.crm.domain.PageIndex;

/**
 * Created by Rian on 2018/11/25.
 * Copyright © 2018 Rian. All rights reserved
 */
public interface CustomerService {
    /**
     * 获取一个客户
     *
     * @param id
     * @return Customer
     */
    public Customer getCustomer(String id);

    /**
     * 获取多个客户
     *
     * @param index,rows
     * @return List
     */
    public PageIndex selectByList(int index, int rows);

    public void saveCustomer(Customer customer);

    void deleteCustomerById(String id);

    void updateCustomer(Customer customer);
}

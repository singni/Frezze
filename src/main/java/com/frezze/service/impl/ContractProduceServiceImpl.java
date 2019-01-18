package com.frezze.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.frezze.domain.*;
import com.frezze.mapper.ContractMapper;
import com.frezze.mapper.ContractProductMapper;
import com.frezze.mapper.ExtCproductMapper;
import com.frezze.mapper.FactoryMapper;
import com.frezze.service.ContractProduceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

/**
 * Created by Rian on 2018/12/26.
 * Copyright © 2018 Rian. All rights reserved
 */
@Service
public class ContractProduceServiceImpl implements ContractProduceService {
    @Autowired
    private ContractProductMapper productMapper;

    @Autowired
    private ContractMapper contractMapper;
    @Autowired
    private FactoryMapper factoryMapper;
    @Autowired
    private ExtCproductMapper extCproductMapper;

    public PageIndex findContractProduceByList(int pageNumber, int pageSize, ContractProduct product) {

        PageHelper.startPage(pageNumber, pageSize);
        ContractProductExample exam = new ContractProductExample();
        if (!StringUtils.isEmpty(product.getContractId())) {
            ContractProductExample.Criteria criteria = exam.createCriteria();
            criteria.andContractIdEqualTo(product.getContractId());
        }
        List<ContractProduct> products = productMapper.selectByExample(exam);
        PageInfo pageInfo = new PageInfo(products);
        long total = pageInfo.getTotal();
        PageIndex pageIndex = new PageIndex();
        pageIndex.setTotal(total);
        pageIndex.setRows(products);
        return pageIndex;
    }


    public void addByContractProduce(ContractProduct product) {
        Contract contract = contractMapper.selectByPrimaryKey(product.getContractId());

        Factory factory = factoryMapper.selectByPrimaryKey(product.getFactoryId());
        product.setFactoryName(factory.getFactoryName());

        product.setContractProductId(UUID.randomUUID().toString());
        Integer cnumber = product.getCnumber();
        BigDecimal multiply = product.getPrice().multiply(BigDecimal.valueOf(cnumber));
       contract.setTotalAmount( contract.getTotalAmount().add(multiply));
        product.setAmount(multiply);
        contractMapper.updateByPrimaryKey(contract);
        productMapper.insert(product);
    }

    public void delByContractProduce(String  id) {
        ContractProduct contractProduct = productMapper.selectByPrimaryKey(id);
        Contract contract = contractMapper.selectByPrimaryKey(contractProduct.getContractId());
        productMapper.deleteByPrimaryKey(id);
        ExtCproductExample exam=new ExtCproductExample();
        exam.createCriteria().andContractProductIdEqualTo(id);
        int exacont = extCproductMapper.countByExample(exam);
        contract.setTotalAmount(contract.getTotalAmount().subtract(contractProduct.getAmount().add(BigDecimal.valueOf(exacont))));
        contractMapper.updateByPrimaryKey(contract);
        extCproductMapper.deleteByExample(exam);
    }
}

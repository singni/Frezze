package com.frezze.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.frezze.domain.*;
import com.frezze.mapper.ContractMapper;
import com.frezze.mapper.ContractProductMapper;
import com.frezze.mapper.ExtCproductMapper;
import com.frezze.mapper.FactoryMapper;
import com.frezze.service.ExtCproductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

/**
 * Created by Rian on 2018/12/27.
 * Copyright © 2018 Rian. All rights reserved
 */
@Service
public class ExtCproductServiceImpl implements ExtCproductService {
    @Autowired
    private ExtCproductMapper extCproductMapper;
    @Autowired
    private FactoryMapper factoryMapper;
    @Autowired
    private ContractProductMapper contractProductMapper;
    @Autowired
    private ContractMapper contractMapper;

    public PageIndex findExtCproductByList(int pageNumber, int pageSize, ExtCproduct extCproduct) {

        PageHelper.startPage(pageNumber, pageSize);

        ExtCproductExample exam = new ExtCproductExample();
        if (!StringUtils.isEmpty(extCproduct.getContractProductId())) {
            ExtCproductExample.Criteria criteria = exam.createCriteria();
            criteria.andContractProductIdEqualTo(extCproduct.getContractProductId());
        }
        List<ExtCproduct> extCproducts = extCproductMapper.selectByExample(exam);
        PageInfo pageInfo = new PageInfo(extCproducts);
        long total = pageInfo.getTotal();
        PageIndex pageIndex = new PageIndex();
        pageIndex.setTotal(total);
        pageIndex.setRows(extCproducts);
        return pageIndex;
    }

    public void addExtCproduct(ExtCproduct extCproduct) {
        ContractProduct contractProduct = contractProductMapper.selectByPrimaryKey(extCproduct.getContractProductId());
        Contract contract = contractMapper.selectByPrimaryKey(contractProduct.getContractId());
        extCproduct.setExtCproductId(UUID.randomUUID().toString());

        Factory factory = factoryMapper.selectByPrimaryKey(extCproduct.getFactoryId());
        extCproduct.setFactoryName(factory.getFactoryName());
        BigDecimal multiply = extCproduct.getPrice().multiply(BigDecimal.valueOf(extCproduct.getCnumber()));
        extCproduct.setAmount(multiply);

        contract.setTotalAmount(contract.getTotalAmount().add(multiply));
        contractMapper.updateByPrimaryKey(contract);
        extCproductMapper.insert(extCproduct);
    }

    public void deleteByExtCproduct(String  id) {
        ExtCproduct extCproduct = extCproductMapper.selectByPrimaryKey(id);
        ContractProduct contractProduct = contractProductMapper.selectByPrimaryKey(extCproduct.getContractProductId());
        Contract contract = contractMapper.selectByPrimaryKey(contractProduct.getContractId());
        contract.setTotalAmount(contract.getTotalAmount().subtract(extCproduct.getAmount()));
        contractMapper.updateByPrimaryKey(contract);
        extCproductMapper.deleteByPrimaryKey(id);
    }


}

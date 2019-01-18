package com.frezze.service.impl;

import com.frezze.domain.*;
import com.frezze.mapper.ContractMapper;
import com.frezze.mapper.ContractProductMapper;
import com.frezze.mapper.ExtCproductMapper;
import com.frezze.service.ContractService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Rian on 2018/12/24.
 * Copyright © 2018 Rian. All rights reserved
 */
@Service
public class ContractServiceImpl implements ContractService {

    @Autowired
    private ContractMapper contractMapper;
    @Autowired
    private ContractProductMapper productMapper;
    @Autowired
    private ExtCproductMapper extCproductMapper;

    public PageIndex findContractByList(int pageNumber, int pageSize, Contract contract) {
        PageHelper.startPage(pageNumber, pageSize);
        ContractExample exam = new ContractExample();
        List<Contract> contracts = contractMapper.selectByExample(exam);
        for (Contract cs : contracts) {
            ContractProductExample pex = new ContractProductExample();
            pex.createCriteria().andContractIdEqualTo(cs.getContractId());
            int pcount = productMapper.countByExample(pex);
            List<ContractProduct> contractProducts = productMapper.selectByExample(pex);
            int ecount = 0;
            for (ContractProduct cp : contractProducts) {
                ExtCproductExample extexam = new ExtCproductExample();
                extexam.createCriteria().andContractProductIdEqualTo(cp.getContractProductId());
                ecount = extCproductMapper.countByExample(extexam);
            }
            cs.setExtCount(pcount + "/" + ecount);
        }
        PageInfo pageInfo = new PageInfo(contracts);
        long total = pageInfo.getTotal();
        PageIndex pageIndex = new PageIndex();
        pageIndex.setTotal(total);
        pageIndex.setRows(contracts);
        return pageIndex;
    }

    public void addByContract(Contract contract) {
        contract.setCreateTime(new Date());
        contract.setContractId(UUID.randomUUID().toString());
        contractMapper.insert(contract);

    }

    public void updateByContract(Contract contract) {
        contract.setUpdateTime(new Date());
        contractMapper.updateByPrimaryKey(contract);
    }

    public void deleteByContract(String id) {
        //删除货物,删除附件
        ContractProductExample exam = new ContractProductExample();
        ContractProductExample.Criteria criteria = exam.createCriteria();
        criteria.andContractIdEqualTo(id);

        List<ContractProduct> products = productMapper.selectByExample(exam);
        for (ContractProduct product : products) {
            ExtCproductExample extample = new ExtCproductExample();
            extample.createCriteria().andContractProductIdEqualTo(product.getContractProductId());
            extCproductMapper.deleteByExample(extample);
        }
        productMapper.deleteByExample(exam);
        contractMapper.deleteByPrimaryKey(id);
    }

    public Contract findContractById(String id) {
        return  contractMapper.selectByPrimaryKey(id);

    }

    public List<Contract> findContractByShipDate(Date date) {

        ContractExample exam=new ContractExample();
        Calendar calendar=new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.MONTH,1);
        calendar.set(calendar.DATE,0);
        Date time = calendar.getTime();
        exam.createCriteria().andShipTimeBetween(date,time);
        return  contractMapper.selectByExample(exam);
    }

    public PageIndex findContractByListStatus(int pageNumber, int pageSize, Contract contract) {
        PageHelper.startPage(pageNumber, pageSize);
        ContractExample exam = new ContractExample();
        exam.createCriteria().andStateEqualTo(1);
        List<Contract> contracts = contractMapper.selectByExample(exam);
        for (Contract cs : contracts) {
            ContractProductExample pex = new ContractProductExample();
            pex.createCriteria().andContractIdEqualTo(cs.getContractId());
            int pcount = productMapper.countByExample(pex);
            List<ContractProduct> contractProducts = productMapper.selectByExample(pex);
            int ecount = 0;
            for (ContractProduct cp : contractProducts) {
                ExtCproductExample extexam = new ExtCproductExample();
                extexam.createCriteria().andContractProductIdEqualTo(cp.getContractProductId());
                ecount = extCproductMapper.countByExample(extexam);
            }
            cs.setExtCount(pcount + "/" + ecount);
        }
        PageInfo pageInfo = new PageInfo(contracts);
        long total = pageInfo.getTotal();
        PageIndex pageIndex = new PageIndex();
        pageIndex.setTotal(total);
        pageIndex.setRows(contracts);
        return pageIndex;
    }
    }


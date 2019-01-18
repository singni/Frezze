package com.frezze.service.impl;

import com.frezze.domain.Factory;
import com.frezze.domain.FactoryExample;
import com.frezze.mapper.FactoryMapper;
import com.frezze.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rian on 2018/12/26.
 * Copyright © 2018 Rian. All rights reserved
 */
@Service
public class FactoryServiceImpl implements FactoryService {

    @Autowired
    private FactoryMapper factoryMapper;

    public List<Factory> findAllByFactory() {
        FactoryExample exam=new FactoryExample();
        List<Factory> factories = factoryMapper.selectByExample(exam);
        return factories;
    }
}

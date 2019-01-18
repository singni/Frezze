package com.frezze.controller;

import com.frezze.domain.Factory;
import com.frezze.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Rian on 2018/12/26.
 * Copyright © 2018 Rian. All rights reserved
 */
@Controller
public class FactoryController {
    @Autowired
    private FactoryService factoryService;

    @RequestMapping("/factory/findAllByFactory")
    @ResponseBody
    public List<Factory> findAllByFactory(){

     return   factoryService.findAllByFactory();

    }
}

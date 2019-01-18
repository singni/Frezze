package com.frezze.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.frezze.domain.*;
import com.frezze.mapper.ModuleMapper;
import com.frezze.service.ModuleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * Created by Rian on 2018/12/17.
 * Copyright © 2018 Rian. All rights reserved
 */
@Service
public class ModuleServiceImpl implements ModuleService {
    @Autowired
    private ModuleMapper moduleMapper;

    public String findModuleByList(int pageNumber, int pageSize, Module module) {
        PageHelper.startPage(pageNumber, pageSize);
        ModuleExample exam = new ModuleExample();
        List<Module> modules = moduleMapper.selectByExample(exam);
        PageInfo pageInfo = new PageInfo(modules);
        long total = pageInfo.getTotal();
        PageIndex pageIndex = new PageIndex();
        pageIndex.setTotal(total);
        pageIndex.setRows(modules);
        return JSONObject.toJSONString(pageIndex, SerializerFeature.DisableCircularReferenceDetect);

    }

    public List<Module> findModuleAll() {

        ModuleExample exam = new ModuleExample();

       exam.setOrderByClause("ORDER_NO");
        return moduleMapper.selectByExample(exam);
    }

    public void addByModule(Module module) {
        module.setModuleId(UUID.randomUUID().toString());
        moduleMapper.insert(module);
    }

    public Module findModuleById(String id) {

        return moduleMapper.selectByPrimaryKey(id);
    }

    public void updateByModule(Module module) {
        module.setUpdateTime(new Date());
        moduleMapper.updateByPrimaryKey(module);
    }

    public void deleteByModuleId(String id) {
        moduleMapper.deleteByPrimaryKey(id);
    }

    public Set<Module> findRoleModuleById(String roleid) {


        return moduleMapper.findRoleModuleById(roleid);
    }


}

package com.frezze.controller;

import com.alibaba.fastjson.JSONObject;
import com.frezze.domain.Module;
import com.frezze.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Created by Rian on 2018/12/11.
 * Copyright © 2018 Rian. All rights reserved
 */
@Controller
public class ModuleController {

    @Autowired
    private ModuleService moduleService;

    @RequestMapping("/module/findModuleByList")
    @ResponseBody
    public String findModuleByList(@RequestParam(required = true, defaultValue = "1") int pageNumber, @RequestParam(required = true, defaultValue = "10") int pageSize, Module module) {
        return moduleService.findModuleByList(pageNumber, pageSize, module);
    }

    @RequestMapping("/module/findModuleByAll")
    @ResponseBody
    /**
     *  { id:1, pId:0, name:"父节点1 - 展开", open:true},
     { id:11, pId:1, name:"父节点11 - 折叠"},
     */
    public String findModuleByAll(String roleId) {
        List<Module> modules = moduleService.findModuleAll();
        Set<Module> moduleSet = moduleService.findRoleModuleById(roleId);
        int size = modules.size();
        //4.组织json串
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (Module module : modules) {
            size--;
            sb.append("{\"id\":\"").append(module.getModuleId());
            sb.append("\",\"pId\":\"").append(module.getParentId());
            sb.append("\",\"name\":\"").append(module.getName());
            sb.append("\",\"checked\":\"");
            if (cheakEng(moduleSet,module)) {
                sb.append("true");
            } else {
                sb.append("false");
            }
            sb.append("\"}");

            if (size > 0) {
                sb.append(",");
            }
        }

        sb.append("]");

        return sb.toString();
    }

     public boolean cheakEng(Set<Module> modules,Module mods){
         for(Module mo: modules){
                 if(mods.getName().equals(mo.getName())){

                     return true;
                 }
         }
         return false;
     }

    @RequestMapping("/module/addByModule")
    public String addByModule(Module module) {
        moduleService.addByModule(module);
        return "/module/list";
    }


    @RequestMapping("/module/findModuleById/{id}")
    @ResponseBody
    public String findModuleById(@PathVariable String id) {
        return JSONObject.toJSONString(moduleService.findModuleById(id));
    }

    @RequestMapping("/module/updateByModule")
    public String updateByModule(Module module) {
        moduleService.updateByModule(module);
        return "/module/list";
    }

    @RequestMapping("/module/deleteByModuleId/{id}")
    public String deleteByModule(@PathVariable String id) {
        moduleService.deleteByModuleId(id);
        return "/module/list";
    }





}

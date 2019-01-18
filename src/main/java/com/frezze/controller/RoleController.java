package com.frezze.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSONObject;
import com.frezze.domain.Module;
import com.frezze.domain.Role;
import com.frezze.domain.UserP;
import com.frezze.service.ModuleService;
import com.frezze.service.RoleService;
import com.frezze.service.UserService;
import com.frezze.vo.ModuleVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Set;

/**
 * Created by Rian on 2018/12/14.
 * Copyright © 2018 Rian. All rights reserved
 */
@Controller
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("/role/findRoleByList")
    @ResponseBody
    public String findRoleByList(@RequestParam(required = true, defaultValue = "1") int pageNumber, @RequestParam(required = true, defaultValue = "10") int pageSize, Role role) {
        return roleService.findRoleByList(pageNumber, pageSize, role);
    }

    @RequestMapping("/role/addByRole")
    public String addByRole(Role role) {
        roleService.addByRole(role);
        return "/role/list";
    }

    @RequestMapping("/role/deleteByRoleId/{id}")
    public String deletByROleId(@PathVariable String id) {
        roleService.deleteByRoleId(id);
        return "/role/list";
    }

    @RequestMapping("/role/updateByRole")
    public String updateByRole(Role role) {
        roleService.updateByRole(role);
        return "/role/list";
    }

    @RequestMapping("/role/findRoleById/{roleId}")
    @ResponseBody
    public Role findRoleById(@PathVariable String roleId) {
        Role roleById = roleService.findRoleById(roleId);
        return roleById;
    }

    @RequestMapping("/role/findAllByRole")
    @ResponseBody
    public List<Role> findAllByRole() {
        return roleService.findAllByRole();
    }

    @RequestMapping("/role/addRolePurview")
    @ResponseBody
    public String addRolePurview(String roleId, String nodes) {
        List<ModuleVo> parse = JSONObject.parseArray(nodes, ModuleVo.class);

        roleService.addRoleByPurview(roleId, parse);
        return null;
    }
}

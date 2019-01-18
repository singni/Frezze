package com.frezze.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.frezze.domain.*;
import com.frezze.mapper.RoleMapper;
import com.frezze.service.RoleService;
import com.frezze.vo.ModuleVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * Created by Rian on 2018/12/14.
 * Copyright © 2018 Rian. All rights reserved
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public String findRoleByList(int pageNumber, int pageSize, Role role) {

      PageHelper.startPage(pageNumber, pageSize);

        RoleExample exam=new RoleExample();
        exam.setOrderByClause("ORDER_NO");
        if(!StringUtils.isEmpty(role.getName())){
            RoleExample.Criteria criteria = exam.createCriteria();
            criteria.andNameEqualTo(role.getName());
        }
        List<Role> roles = roleMapper.selectByExample(exam);
        PageInfo pageInfo = new PageInfo(roles);
        long total = pageInfo.getTotal();
        PageIndex pageIndex = new PageIndex();
        pageIndex.setTotal(total);
        pageIndex.setRows(roles);
        return JSONObject.toJSONString(pageIndex, SerializerFeature.DisableCircularReferenceDetect);
    }



    public void addByRole(Role role) {
        int i = roleMapper.selectMaxOrderNo();
        role.setOrderNo(i+1);
        role.setRoleId(UUID.randomUUID().toString());
        role.setCreateTime(new Date());
     roleMapper.insert(role);
    }

    public Role findRoleById(String id) {
        Role role = roleMapper.selectByPrimaryKey(id);
        return role;
    }

    public void updateByRole(Role role) {
        role.setUpdateTime(new Date());

        roleMapper.updateByPrimaryKey(role);

    }

    public void deleteByRoleId(String id) {
        roleMapper.deleteByPrimaryKey(id);
    }

    public List<Role> findAllByRole() {
        RoleExample exam=new RoleExample();
        return roleMapper.selectByExample(exam);
    }

    public void addRoleByPurview(String roleId, List<ModuleVo> modules){
        roleMapper.deletePurview(roleId);
        for(ModuleVo module:modules){
            roleMapper.insertPurview(roleId,module.getId());
        }

    }


}

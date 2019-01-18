package com.frezze.service;

import com.frezze.domain.Module;
import com.frezze.domain.Role;
import com.frezze.domain.UserP;
import com.frezze.vo.ModuleVo;

import java.util.List;
import java.util.Set;

/**
 * Created by Rian on 2018/12/14.
 * Copyright © 2018 Rian. All rights reserved
 */
public interface RoleService {
    public String findRoleByList(int pageNumber, int page, Role role);

    void addByRole(Role role);

    Role findRoleById(String id);

    void updateByRole(Role role);

    void deleteByRoleId(String id);

    List<Role> findAllByRole();



    void addRoleByPurview(String roleId, List<ModuleVo> modules);
}

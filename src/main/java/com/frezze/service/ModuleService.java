package com.frezze.service;

import com.frezze.domain.Module;

import java.util.List;
import java.util.Set;

/**
 * Created by Rian on 2018/12/17.
 * Copyright © 2018 Rian. All rights reserved
 */
public interface ModuleService {
    List<Module> findModuleAll();

    void addByModule(Module module);

    Module findModuleById(String id);

    void updateByModule(Module module);

    void deleteByModuleId(String id);

    String findModuleByList(int pageNumber, int pageSize, Module module);

    Set<Module> findRoleModuleById(String roleid);
}

package com.frezze.service;


import com.frezze.domain.Factory;

import java.util.List;

/**
 * Created by Rian on 2018/12/26.
 * Copyright © 2018 Rian. All rights reserved
 */
public interface FactoryService {
    List<Factory> findAllByFactory();
}

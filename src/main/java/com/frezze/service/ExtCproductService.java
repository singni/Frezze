package com.frezze.service;

import com.frezze.domain.ExtCproduct;
import com.frezze.domain.PageIndex;

/**
 * Created by Rian on 2018/12/27.
 * Copyright © 2018 Rian. All rights reserved
 */
public interface ExtCproductService {
    public PageIndex findExtCproductByList(int pageNumber, int pageSize, ExtCproduct extCproduct);

    void addExtCproduct(ExtCproduct extCproduct);


    public void deleteByExtCproduct(String id);
}

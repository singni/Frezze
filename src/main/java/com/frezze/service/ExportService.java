package com.frezze.service;

import com.frezze.domain.Export;

/**
 * Created by Rian on 2019/1/12.
 * Copyright © 2018 Rian. All rights reserved
 */
public interface ExportService {


    public void addExport(Export export);

    String findExportByList(int pageNumber, int pageSize, Export export);

    Export findExportById(String id);
}

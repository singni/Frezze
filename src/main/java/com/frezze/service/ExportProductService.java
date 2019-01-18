package com.frezze.service;

import com.frezze.domain.ExportProduct;

/**
 * Created by Rian on 2019/1/16.
 * Copyright © 2018 Rian. All rights reserved
 */
public interface ExportProductService {
    String findExportByList(int pageNumber, int pageSize, ExportProduct export);

    void updateExportProduct(ExportProduct exportProduct);
}

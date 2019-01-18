package com.frezze.service;

import com.frezze.domain.Contract;
import com.frezze.domain.ContractProduct;
import com.frezze.domain.PageIndex;
import org.springframework.stereotype.Service;

/**
 * Created by Rian on 2018/12/26.
 * Copyright © 2018 Rian. All rights reserved
 */

public interface ContractProduceService {
    PageIndex findContractProduceByList(int pageNumber, int pageSize, ContractProduct product);


    void addByContractProduce(ContractProduct product);


    void delByContractProduce(String  id);
}

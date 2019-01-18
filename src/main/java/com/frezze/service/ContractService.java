package com.frezze.service;

import com.frezze.domain.Contract;
import com.frezze.domain.PageIndex;

import java.util.Date;
import java.util.List;

/**
 * Created by Rian on 2018/12/24.
 * Copyright © 2018 Rian. All rights reserved
 */
public interface ContractService {


    public PageIndex findContractByList(int pageNumber, int page, Contract contract);


    void addByContract(Contract contract);

    void updateByContract(Contract contract);

    void deleteByContract(String id);

    Contract findContractById(String id);

    List<Contract> findContractByShipDate(Date date);

    PageIndex findContractByListStatus(int pageNumber, int pageSize, Contract contract);
}

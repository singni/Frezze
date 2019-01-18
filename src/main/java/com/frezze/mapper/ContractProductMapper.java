package com.frezze.mapper;

import com.frezze.domain.ContractProduct;
import com.frezze.domain.ContractProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContractProductMapper {
    int countByExample(ContractProductExample example);

    int deleteByExample(ContractProductExample example);

    int deleteByPrimaryKey(String contractProductId);

    int insert(ContractProduct record);

    int insertSelective(ContractProduct record);

    List<ContractProduct> selectByExample(ContractProductExample example);

    ContractProduct selectByPrimaryKey(String contractProductId);

    int updateByExampleSelective(@Param("record") ContractProduct record, @Param("example") ContractProductExample example);

    int updateByExample(@Param("record") ContractProduct record, @Param("example") ContractProductExample example);

    int updateByPrimaryKeySelective(ContractProduct record);

    int updateByPrimaryKey(ContractProduct record);
}
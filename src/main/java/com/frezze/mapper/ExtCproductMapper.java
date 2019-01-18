package com.frezze.mapper;

import com.frezze.domain.ExtCproduct;
import com.frezze.domain.ExtCproductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExtCproductMapper {
    int countByExample(ExtCproductExample example);

    int deleteByExample(ExtCproductExample example);

    int deleteByPrimaryKey(String extCproductId);

    int insert(ExtCproduct record);

    int insertSelective(ExtCproduct record);

    List<ExtCproduct> selectByExample(ExtCproductExample example);

    ExtCproduct selectByPrimaryKey(String extCproductId);

    int updateByExampleSelective(@Param("record") ExtCproduct record, @Param("example") ExtCproductExample example);

    int updateByExample(@Param("record") ExtCproduct record, @Param("example") ExtCproductExample example);

    int updateByPrimaryKeySelective(ExtCproduct record);

    int updateByPrimaryKey(ExtCproduct record);
}
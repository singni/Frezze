package com.frezze.mapper;

import com.frezze.domain.ExportExample;
import com.frezze.domain.ExportProduct;
import com.frezze.domain.ExportProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExportProductMapper {
    int countByExample(ExportProductExample example);

    int deleteByExample(ExportProductExample example);

    int deleteByPrimaryKey(String exportProductId);

    int insert(ExportProduct record);

    int insertSelective(ExportProduct record);

    List<ExportProduct> selectByExample(ExportProductExample example);

    ExportProduct selectByPrimaryKey(String exportProductId);

    int updateByExampleSelective(@Param("record") ExportProduct record, @Param("example") ExportProductExample example);

    int updateByExample(@Param("record") ExportProduct record, @Param("example") ExportProductExample example);

    int updateByPrimaryKeySelective(ExportProduct record);

    int updateByPrimaryKey(ExportProduct record);
}
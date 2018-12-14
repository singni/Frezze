package com.frezze.mapper;

import com.frezze.domain.DeptP;
import com.frezze.domain.DeptPExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptPMapper {
    int countByExample(DeptPExample example);

    int deleteByExample(DeptPExample example);

    int deleteByPrimaryKey(String deptId);

    int insert(DeptP record);

    int insertSelective(DeptP record);

    List<DeptP> selectByExample(DeptPExample example);

    DeptP selectByPrimaryKey(String deptId);

    int updateByExampleSelective(@Param("record") DeptP record, @Param("example") DeptPExample example);

    int updateByExample(@Param("record") DeptP record, @Param("example") DeptPExample example);

    int updateByPrimaryKeySelective(DeptP record);

    int updateByPrimaryKey(DeptP record);
}
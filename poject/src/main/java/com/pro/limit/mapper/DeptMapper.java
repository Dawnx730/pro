package com.pro.limit.mapper;

import com.pro.limit.model.Dept;

public interface DeptMapper {
    int deleteByPrimaryKey(Integer deptid);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer deptid);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}
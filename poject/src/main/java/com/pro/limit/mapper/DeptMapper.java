package com.pro.limit.mapper;

import com.pro.limit.model.Dept;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptMapper {
    int deleteByPrimaryKey(Integer deptid);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer deptid);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

    String getDeptById(Dept dept);
}
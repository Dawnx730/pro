package com.pro.rem.mapper;

import com.pro.rem.model.Salary;

public interface SalaryMapper {
    int insert(Salary record);

    int insertSelective(Salary record);
}
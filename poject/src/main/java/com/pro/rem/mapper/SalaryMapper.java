package com.pro.rem.mapper;

import com.pro.limit.model.User;
import com.pro.rem.model.Salary;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SalaryMapper {
    int insert(Salary record);

    int insertSelective(Salary record);

    List<Salary> SelectById(User user);
}
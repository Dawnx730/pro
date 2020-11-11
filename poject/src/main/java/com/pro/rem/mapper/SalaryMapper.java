package com.pro.rem.mapper;

import com.pro.limit.model.User;
import com.pro.rem.model.Salary;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SalaryMapper {
    int insert(Salary record);

    int insertSelective(Salary record);

    List<Map>  SelectById(Map map);

    List<Map> getAll(Map map);
}
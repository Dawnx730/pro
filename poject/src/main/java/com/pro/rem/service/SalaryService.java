package com.pro.rem.service;

import com.pro.limit.model.User;
import com.pro.rem.model.Salary;

import java.util.List;
import java.util.Map;

/**
 * @author xiaoyang
 * @create  2020-11-10 22:22
 */
public interface SalaryService {

    int insert(Salary record);

    int insertSelective(Salary record);

    List<Map>  SelectById(Map map);

    List<Map> getAll(Map map);
}

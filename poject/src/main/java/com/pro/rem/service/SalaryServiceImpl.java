package com.pro.rem.service;

import com.pro.limit.model.User;
import com.pro.rem.mapper.SalaryMapper;
import com.pro.rem.model.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author xiaoyang
 * @create  2020-11-10 22:22
 */
@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    private SalaryMapper salaryMapper;

    @Override
    public int insert(Salary record) {
        return salaryMapper.insert(record);
    }

    @Override
    public int insertSelective(Salary record) {
        return salaryMapper.insertSelective(record);
    }

    @Override
    public  List<Map> SelectById(Map map) {
        return salaryMapper.SelectById(map);
    }

    @Override
    public List<Map>  getAll(Map map) {
        return salaryMapper.getAll(map);
    }
}

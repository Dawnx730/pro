package com.pro.limit.service;

import com.pro.limit.mapper.DeptMapper;
import com.pro.limit.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author xiaoyang
 * @create  2020-11-11 9:20
 */
@Service
public class DeptServiceImpl implements DeptService{
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public String getDeptById(Dept dept) {
        return deptMapper.getDeptById(dept);
    }

    @Override
    public List<Map> getAll() {
        return deptMapper.getAll();
    }


}

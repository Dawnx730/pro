package com.pro.rem.service;

import com.pro.rem.mapper.SalaryMapper;
import com.pro.rem.model.Salary;
import com.pro.rem.model.Timecard;
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

    @Override
    public List<Map>  SalaryRep(Timecard timecard) {
        return salaryMapper.SalaryRep(timecard);
    }

    @Override
    public Integer approval(Map map) {
        return salaryMapper.approval(map);
    }

    @Override
    public void updateSalStatus(Map map) {
        salaryMapper.updateSalStatus(map);
    }

    @Override
    public void updateSalStatusT(Map map) {
        salaryMapper.updateSalStatusT(map);
    }

    @Override
    public void updSp(Map map) {
        salaryMapper.updSp(map);
    }


    @Override
    public void updateSalStatusF(Map map) {
        salaryMapper.updateSalStatusF(map);
    }

    @Override
    public List<Map> getAllBySta(Map map) {
        return salaryMapper.getAllBySta(map);
    }
}

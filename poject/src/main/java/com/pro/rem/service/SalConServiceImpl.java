package com.pro.rem.service;

import com.pro.rem.mapper.SalconMapper;
import com.pro.rem.model.Salcon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author xiaoyang
 * @create  2020-11-13 0:57
 */
@Service
public class SalConServiceImpl implements SalConService {

    @Autowired
    private SalconMapper salconMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return salconMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Salcon record) {
        return salconMapper.insert(record);
    }

    @Override
    public int insertSelective(Salcon record) {
        return salconMapper.insertSelective(record);
    }

    @Override
    public Salcon selectByPrimaryKey(Integer id) {
        return salconMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Salcon record) {
        return salconMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Salcon record) {
        return salconMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Map> getAllSalCon() {
        return salconMapper.getAllSalCon();
    }

    @Override
    public List<Salcon> getAllSalConById(Salcon salcon) {
        return salconMapper.getAllSalConById(salcon);
    }

    @Override
    public List<Map> getRep(Map map) {
        return salconMapper.getRep(map);
    }

    @Override
    public void updByID(Salcon salcon) {
        salconMapper.updByID(salcon);
    }

    @Override
    public void DelByID(Salcon salcon) {
        salconMapper.DelByID(salcon);
    }
}

package com.pro.contract.service.impl;

import com.pro.contract.mapper.contractMapper;
import com.pro.contract.model.contract;
import com.pro.contract.service.ContractService;
import com.pro.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author wang
 * @site https://blog.csdn.net/qq_45432593
 * @create 2020-11-16  20:00
 */
@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    private contractMapper contractMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
       return  contractMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(contract record) {
        return contractMapper.insert(record);
    }

    @Override
    public int insertSelective(contract record) {
        return contractMapper.insertSelective(record);
    }

    @Override
    public contract selectByPrimaryKey(Integer id) {
        return contractMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(contract record) {
        return contractMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(contract record) {
        return contractMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Map> listPager(Map map, PageBean pageBean) {
        return contractMapper.listPager(map);
    }

    @Override
    public contract quanContract(String cname) {
        return contractMapper.quanContract(cname);
    }


}

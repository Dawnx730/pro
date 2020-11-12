package com.pro.contract.service.impl;

import com.pro.contract.mapper.ContractMapper;
import com.pro.contract.model.Contract;
import com.pro.contract.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wang
 * @site https://blog.csdn.net/qq_45432593
 * @create 2020-11-06  14:19
 */
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractMapper contractMapper;

    public ContractMapper getContractMapper() {
        return contractMapper;
    }

    public void setContractMapper(ContractMapper contractMapper) {
        this.contractMapper = contractMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return contractMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Contract record) {
        return contractMapper.insert(record);
    }

    @Override
    public int insertSelective(Contract record) {
        return contractMapper.insertSelective(record);
    }

    @Override
    public Contract selectByPrimaryKey(Integer id) {
        return contractMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Contract record) {
        return contractMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Contract record) {
        return contractMapper.updateByPrimaryKey(record);
    }

//    @Override
//    public List<Contract> selectContract(List id) {
//        return contractMapper.selectContract(id);
//    }
}

package com.pro.contract.service.impl;

import com.pro.contract.mapper.ContractMapper;
import com.pro.contract.model.Contract;
import com.pro.contract.service.ContractService;

/**
 * @author wang
 * @site https://blog.csdn.net/qq_45432593
 * @create 2020-11-06  14:19
 */
public class ContractServiceImpl implements ContractService {
    private ContractMapper contractMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Contract record) {
        return 0;
    }

    @Override
    public int insertSelective(Contract record) {
        return 0;
    }

    @Override
    public Contract selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Contract record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Contract record) {
        return 0;
    }
}

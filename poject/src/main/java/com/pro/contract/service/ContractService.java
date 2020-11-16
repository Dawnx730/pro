package com.pro.contract.service;

import com.pro.contract.model.contract;

/**
 * @author wang
 * @site https://blog.csdn.net/qq_45432593
 * @create 2020-11-06  14:06
 */
public interface ContractService {
    int deleteByPrimaryKey(Integer id);

    int insert(contract record);

    int insertSelective(contract record);

    contract selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(contract record);

    int updateByPrimaryKey(contract record);

}
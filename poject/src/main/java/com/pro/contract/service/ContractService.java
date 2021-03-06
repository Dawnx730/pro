package com.pro.contract.service;

import com.pro.contract.model.contract;
import com.pro.util.PageBean;

import java.util.List;
import java.util.Map;

/**
 * @author wang
 * @site https://blog.csdn.net/qq_45432593
 * @create 2020-11-16  19:54
 */
public interface ContractService {
    //删除
    int deleteByPrimaryKey(Integer id);

    int insert(contract record);
    //增加
    int insertSelective(contract record);

    contract selectByPrimaryKey(Integer id);
    //修改
    int updateByPrimaryKeySelective(contract record);

    int updateByPrimaryKey(contract record);

    List<Map> listPager(Map map , PageBean pageBean);

    contract quanContract(String cname);


}

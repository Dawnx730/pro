package com.pro.contract.service;

import com.pro.contract.model.Contract;
import com.pro.contract.model.Personnel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wang
 * @site https://blog.csdn.net/qq_45432593
 * @create 2020-11-06  14:32
 */
public interface PersonnelService {

    int deleteByPrimaryKey(Integer pid);

    int insert(Personnel record);

    int insertSelective(Personnel record);

    Personnel selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Personnel record);

    int updateByPrimaryKey(Personnel record);

    List<Personnel> selectPersonnel(List pid);


    /**
     * 模糊查询
     * @return
     */
    List<Contract> selectContractLike(@Param("cname") String cname);

}

package com.pro.contract.mapper;

import com.pro.contract.model.contract;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface contractMapper {

    //删除
    int deleteByPrimaryKey(Integer id);

    int insert(contract record);
   //增加
    int insertSelective(contract record);

    contract selectByPrimaryKey(Integer id);
 //修改
    int updateByPrimaryKeySelective(contract record);


    int updateByPrimaryKey(contract record);


    /**
     * 查询
     */

    List<Map> listPager(Map map);

    contract quanContract(@Param("cname") String cname);


}
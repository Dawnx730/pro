package com.pro.contract.mapper;

import com.pro.contract.model.Personnel;
import com.pro.util.PageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PersonnelMapper {

    int deleteByPrimaryKey(Integer pid);

    int insert(Personnel record);

    int insertSelective(Personnel record);

    Personnel selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Personnel record);

    int updateByPrimaryKey(Personnel record);


    List<Map> listPager(Map map);

    Personnel quanPersonnel(String cname);



}
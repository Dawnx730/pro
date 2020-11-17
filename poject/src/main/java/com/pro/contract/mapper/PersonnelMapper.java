package com.pro.contract.mapper;

import com.pro.contract.model.Personnel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonnelMapper {

    int deleteByPrimaryKey(Integer pid);

    int insert(Personnel record);

    int insertSelective(Personnel record);

    Personnel selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Personnel record);

    int updateByPrimaryKey(Personnel record);






}
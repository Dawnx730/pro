package com.pro.trainingapproval.mapper;

import com.pro.trainingapproval.model.Userinfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserinfoMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);

}
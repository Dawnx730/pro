package com.pro.limit.mapper;

import com.pro.limit.model.Userinfo;

public interface UserinfoMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
}
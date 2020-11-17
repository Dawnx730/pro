package com.pro.trainingapproval.service;

import com.pro.trainingapproval.model.Userinfo;

/**
 * @author 炽吃痴
 * @companv xxx公司
 * @create 2020 34 17 14:34
 */
public interface UserinfoService {

    int deleteByPrimaryKey(Integer fid);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
}

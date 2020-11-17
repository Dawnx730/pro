package com.pro.trainingapproval.service;

import com.pro.trainingapproval.mapper.UserinfoMapper;
import com.pro.trainingapproval.model.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 炽吃痴
 * @companv xxx公司
 * @create 2020 35 17 14:35
 */
@Service
public class UserinfoServiceImpl implements UserinfoService {

    @Autowired
    private UserinfoMapper userinfoMapper;


    @Override
    public int deleteByPrimaryKey(Integer fid) {
        return userinfoMapper.deleteByPrimaryKey(fid);
    }

    @Override
    public int insert(Userinfo record) {
        return userinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Userinfo record) {
        return userinfoMapper.insertSelective(record);
    }

    @Override
    public Userinfo selectByPrimaryKey(Integer fid) {
        return userinfoMapper.selectByPrimaryKey(fid);
    }

    @Override
    public int updateByPrimaryKeySelective(Userinfo record) {
        return userinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Userinfo record) {
        return userinfoMapper.updateByPrimaryKey(record);
    }
}

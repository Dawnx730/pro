package com.pro.trainingapproval.service;

import com.pro.trainingapproval.mapper.TrainingplanMapper;
import com.pro.trainingapproval.model.Trainingplan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 邦无敌
 * @site https://blog.csdn.net/YoonBongChi
 * @compsny 邦无敌公司
 * @create 2020-11-11-12:19
 */
@Service
public class TrainingplanServiceImpl implements TrainingplanService {
    @Autowired
    private TrainingplanMapper trainingplanMapper;
    @Override
    public int deleteByPrimaryKey(Integer trid) {
        return trainingplanMapper.deleteByPrimaryKey(trid);
    }

    @Override
    public int insert(Trainingplan record) {
        return trainingplanMapper.insert(record);
    }

    @Override
    public int insertSelective(Trainingplan record) {
        return trainingplanMapper.insertSelective(record);
    }

    @Override
    public Trainingplan selectByPrimaryKey(Integer trid) {
        return trainingplanMapper.selectByPrimaryKey(trid);
    }

    @Override
    public int updateByPrimaryKeySelective(Trainingplan record) {
        return trainingplanMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Trainingplan record) {
        return trainingplanMapper.updateByPrimaryKey(record);
    }
}

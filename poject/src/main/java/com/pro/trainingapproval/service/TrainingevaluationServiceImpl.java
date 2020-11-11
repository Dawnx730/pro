package com.pro.trainingapproval.service;

import com.pro.trainingapproval.mapper.TrainingevaluationMapper;
import com.pro.trainingapproval.model.Trainingevaluation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 邦无敌
 * @site https://blog.csdn.net/YoonBongChi
 * @compsny 邦无敌公司
 * @create 2020-11-11-12:14
 */
@Service
public class TrainingevaluationServiceImpl implements TrainingevaluationService {

    @Autowired
    private TrainingevaluationMapper trainingevaluationMapper;

    @Override
    public int deleteByPrimaryKey(Integer teid) {
        return trainingevaluationMapper.deleteByPrimaryKey(teid);
    }

    @Override
    public int insert(Trainingevaluation record) {
        return trainingevaluationMapper.insert(record);
    }

    @Override
    public int insertSelective(Trainingevaluation record) {
        return trainingevaluationMapper.insertSelective(record);
    }

    @Override
    public Trainingevaluation selectByPrimaryKey(Integer teid) {
        return trainingevaluationMapper.selectByPrimaryKey(teid);
    }

    @Override
    public int updateByPrimaryKeySelective(Trainingevaluation record) {
        return trainingevaluationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Trainingevaluation record) {
        return trainingevaluationMapper.updateByPrimaryKey(record);
    }
}

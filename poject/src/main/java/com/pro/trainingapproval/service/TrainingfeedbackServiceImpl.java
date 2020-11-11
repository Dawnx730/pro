package com.pro.trainingapproval.service;

import com.pro.trainingapproval.mapper.TrainingfeedbackMapper;
import com.pro.trainingapproval.model.Trainingfeedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 邦无敌
 * @site https://blog.csdn.net/YoonBongChi
 * @compsny 邦无敌公司
 * @create 2020-11-11-12:17
 */
@Service
public class TrainingfeedbackServiceImpl implements TrainingfeedbackService {
    @Autowired
    private TrainingfeedbackMapper trainingfeedbackMapper;

    @Override
    public int deleteByPrimaryKey(Integer tfid) {
        return trainingfeedbackMapper.deleteByPrimaryKey(tfid);
    }

    @Override
    public int insert(Trainingfeedback record) {
        return trainingfeedbackMapper.insert(record);
    }

    @Override
    public int insertSelective(Trainingfeedback record) {
        return trainingfeedbackMapper.insertSelective(record);
    }

    @Override
    public Trainingfeedback selectByPrimaryKey(Integer tfid) {
        return trainingfeedbackMapper.selectByPrimaryKey(tfid);
    }

    @Override
    public int updateByPrimaryKeySelective(Trainingfeedback record) {
        return trainingfeedbackMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Trainingfeedback record) {
        return trainingfeedbackMapper.updateByPrimaryKey(record);
    }
}

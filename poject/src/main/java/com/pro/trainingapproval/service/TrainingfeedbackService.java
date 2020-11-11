package com.pro.trainingapproval.service;

import com.pro.trainingapproval.model.Trainingfeedback;

/**
 * @author 邦无敌
 * @site https://blog.csdn.net/YoonBongChi
 * @compsny 邦无敌公司
 * @create 2020-11-11-11:59
 */
public interface TrainingfeedbackService {

    int deleteByPrimaryKey(Integer tfid);

    int insert(Trainingfeedback record);

    int insertSelective(Trainingfeedback record);

    Trainingfeedback selectByPrimaryKey(Integer tfid);

    int updateByPrimaryKeySelective(Trainingfeedback record);

    int updateByPrimaryKey(Trainingfeedback record);
}

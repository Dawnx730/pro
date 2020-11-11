package com.pro.trainingapproval.service;

import com.pro.trainingapproval.model.Trainingevaluation;

/**
 * @author 邦无敌
 * @site https://blog.csdn.net/YoonBongChi
 * @compsny 邦无敌公司
 * @create 2020-11-11-11:59
 */
public interface TrainingevaluationService {

    int deleteByPrimaryKey(Integer teid);

    int insert(Trainingevaluation record);

    int insertSelective(Trainingevaluation record);

    Trainingevaluation selectByPrimaryKey(Integer teid);

    int updateByPrimaryKeySelective(Trainingevaluation record);

    int updateByPrimaryKey(Trainingevaluation record);
}

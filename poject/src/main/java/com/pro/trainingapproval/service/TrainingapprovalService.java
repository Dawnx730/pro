package com.pro.trainingapproval.service;

import com.pro.trainingapproval.model.Trainingapproval;

/**
 * @author 邦无敌
 * @site https://blog.csdn.net/YoonBongChi
 * @compsny 邦无敌公司
 * @create 2020-11-11-11:58
 */
public interface TrainingapprovalService {

    int deleteByPrimaryKey(Integer taid);

    int insert(Trainingapproval record);

    int insertSelective(Trainingapproval record);

    Trainingapproval selectByPrimaryKey(Integer taid);

    int updateByPrimaryKeySelective(Trainingapproval record);

    int updateByPrimaryKey(Trainingapproval record);
}

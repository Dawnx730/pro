package com.pro.trainingapproval.service;

import com.pro.trainingapproval.model.Trainingprograms;

/**
 * @author 邦无敌
 * @site https://blog.csdn.net/YoonBongChi
 * @compsny 邦无敌公司
 * @create 2020-11-11-12:03
 */
public interface TrainingprogramsService {

    int deleteByPrimaryKey(Integer tpid);

    int insert(Trainingprograms record);

    int insertSelective(Trainingprograms record);

    Trainingprograms selectByPrimaryKey(Integer tpid);

    int updateByPrimaryKeySelective(Trainingprograms record);

    int updateByPrimaryKey(Trainingprograms record);
}

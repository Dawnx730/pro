package com.pro.trainingapproval.service;

import com.pro.trainingapproval.model.Trainingplan;

/**
 * @author 邦无敌
 * @site https://blog.csdn.net/YoonBongChi
 * @compsny 邦无敌公司
 * @create 2020-11-11-12:00
 */
public interface TrainingplanService {

    int deleteByPrimaryKey(Integer trid);

    int insert(Trainingplan record);

    int insertSelective(Trainingplan record);

    Trainingplan selectByPrimaryKey(Integer trid);

    int updateByPrimaryKeySelective(Trainingplan record);

    int updateByPrimaryKey(Trainingplan record);
}

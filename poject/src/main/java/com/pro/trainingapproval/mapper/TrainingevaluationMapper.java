package com.pro.trainingapproval.mapper;

import com.pro.trainingapproval.model.Trainingevaluation;

public interface TrainingevaluationMapper {
    int deleteByPrimaryKey(Integer teid);

    int insert(Trainingevaluation record);

    int insertSelective(Trainingevaluation record);

    Trainingevaluation selectByPrimaryKey(Integer teid);

    int updateByPrimaryKeySelective(Trainingevaluation record);

    int updateByPrimaryKey(Trainingevaluation record);
}
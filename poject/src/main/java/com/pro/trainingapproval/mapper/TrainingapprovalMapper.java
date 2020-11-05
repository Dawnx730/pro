package com.pro.trainingapproval.mapper;

import com.pro.trainingapproval.model.Trainingapproval;

public interface TrainingapprovalMapper {
    int deleteByPrimaryKey(Integer taid);

    int insert(Trainingapproval record);

    int insertSelective(Trainingapproval record);

    Trainingapproval selectByPrimaryKey(Integer taid);

    int updateByPrimaryKeySelective(Trainingapproval record);

    int updateByPrimaryKey(Trainingapproval record);
}
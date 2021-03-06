package com.pro.trainingapproval.mapper;

import com.pro.trainingapproval.model.Trainingplan;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingplanMapper {
    int deleteByPrimaryKey(Integer trid);

    int insert(Trainingplan record);

    int insertSelective(Trainingplan record);

    Trainingplan selectByPrimaryKey(Integer trid);

    int updateByPrimaryKeySelective(Trainingplan record);

    int updateByPrimaryKey(Trainingplan record);
}
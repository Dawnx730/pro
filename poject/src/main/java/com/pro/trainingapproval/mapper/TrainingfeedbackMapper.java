package com.pro.trainingapproval.mapper;

import com.pro.trainingapproval.model.Trainingfeedback;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingfeedbackMapper {
    int deleteByPrimaryKey(Integer tfid);

    int insert(Trainingfeedback record);

    int insertSelective(Trainingfeedback record);

    Trainingfeedback selectByPrimaryKey(Integer tfid);

    int updateByPrimaryKeySelective(Trainingfeedback record);

    int updateByPrimaryKey(Trainingfeedback record);
}
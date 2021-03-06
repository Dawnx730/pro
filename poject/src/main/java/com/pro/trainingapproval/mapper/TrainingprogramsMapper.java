package com.pro.trainingapproval.mapper;

import com.pro.trainingapproval.model.Trainingprograms;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingprogramsMapper {
    int deleteByPrimaryKey(Integer tpid);

    int insert(Trainingprograms record);

    int insertSelective(Trainingprograms record);

    Trainingprograms selectByPrimaryKey(Integer tpid);

    int updateByPrimaryKeySelective(Trainingprograms record);

    int updateByPrimaryKey(Trainingprograms record);
}
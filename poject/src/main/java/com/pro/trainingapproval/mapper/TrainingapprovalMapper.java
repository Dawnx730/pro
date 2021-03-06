package com.pro.trainingapproval.mapper;

import com.pro.trainingapproval.model.Trainingapproval;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TrainingapprovalMapper {
    int deleteByPrimaryKey(Integer taid);

    int insert(Trainingapproval record);

    int insertSelective(Trainingapproval record);

    Trainingapproval selectByPrimaryKey(Integer taid);

    int updateByPrimaryKeySelective(Trainingapproval record);

    int updateByPrimaryKey(Trainingapproval record);

    List<Map> listPager(Map map);
}
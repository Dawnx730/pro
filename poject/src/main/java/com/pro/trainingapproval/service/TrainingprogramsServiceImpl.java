package com.pro.trainingapproval.service;

import com.pro.trainingapproval.mapper.TrainingprogramsMapper;
import com.pro.trainingapproval.model.Trainingprograms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 邦无敌
 * @site https://blog.csdn.net/YoonBongChi
 * @compsny 邦无敌公司
 * @create 2020-11-11-12:22
 */
@Service
public class TrainingprogramsServiceImpl implements TrainingprogramsService {
    @Autowired
    private TrainingprogramsMapper trainingprogramsMapper;

    @Override
    public int deleteByPrimaryKey(Integer tpid) {
        return trainingprogramsMapper.deleteByPrimaryKey(tpid);
    }

    @Override
    public int insert(Trainingprograms record) {
        return trainingprogramsMapper.insert(record);
    }

    @Override
    public int insertSelective(Trainingprograms record) {
        return trainingprogramsMapper.insertSelective(record);
    }

    @Override
    public Trainingprograms selectByPrimaryKey(Integer tpid) {
        return trainingprogramsMapper.selectByPrimaryKey(tpid);
    }

    @Override
    public int updateByPrimaryKeySelective(Trainingprograms record) {
        return trainingprogramsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Trainingprograms record) {
        return trainingprogramsMapper.updateByPrimaryKey(record);
    }
}

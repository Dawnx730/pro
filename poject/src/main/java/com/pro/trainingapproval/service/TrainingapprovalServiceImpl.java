package com.pro.trainingapproval.service;

import com.pro.trainingapproval.mapper.TrainingapprovalMapper;
import com.pro.trainingapproval.model.Trainingapproval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 邦无敌
 * @site https://blog.csdn.net/YoonBongChi
 * @compsny 邦无敌公司
 * @create 2020-11-11-12:06
 */
@Service
public class TrainingapprovalServiceImpl implements TrainingapprovalService {
    @Autowired
    private TrainingapprovalMapper trainingapprovalMapper;

    @Override
    public int deleteByPrimaryKey(Integer taid) {
        return trainingapprovalMapper.deleteByPrimaryKey(taid);
    }

    @Override
    public int insert(Trainingapproval record) {
        return trainingapprovalMapper.insert(record);
    }

    @Override
    public int insertSelective(Trainingapproval record) {
        return trainingapprovalMapper.insertSelective(record);
    }

    @Override
    public Trainingapproval selectByPrimaryKey(Integer taid) {
        return trainingapprovalMapper.selectByPrimaryKey(taid);
    }

    @Override
    public int updateByPrimaryKeySelective(Trainingapproval record) {
        return trainingapprovalMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Trainingapproval record) {
        return trainingapprovalMapper.updateByPrimaryKey(record);
    }
}

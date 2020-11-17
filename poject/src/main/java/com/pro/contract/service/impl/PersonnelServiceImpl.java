package com.pro.contract.service.impl;

import com.pro.contract.mapper.PersonnelMapper;
import com.pro.contract.model.Personnel;
import com.pro.contract.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wang
 * @site https://blog.csdn.net/qq_45432593
 * @create 2020-11-09  19:12
 */
@Service
public class PersonnelServiceImpl implements PersonnelService {
    @Autowired
    private PersonnelMapper personnelMapper;

    public PersonnelMapper getPersonnelMapper() {
        return personnelMapper;
    }

    public void setPersonnelMapper(PersonnelMapper personnelMapper) {
        this.personnelMapper = personnelMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer pid) {
        return personnelMapper.deleteByPrimaryKey(pid);
    }

    @Override
    public int insert(Personnel record) {
        return personnelMapper.insert(record);
    }

    @Override
    public int insertSelective(Personnel record) {
        return personnelMapper.insertSelective(record);
    }

    @Override
    public Personnel selectByPrimaryKey(Integer pid) {
        return personnelMapper.selectByPrimaryKey(pid);
    }

    @Override
    public int updateByPrimaryKeySelective(Personnel record) {
        return personnelMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Personnel record) {
        return personnelMapper.updateByPrimaryKey(record);
    }

   /* @Override
    public List<Personnel> selectPersonnel(List pid) {
        return personnelMapper.selectPersonnel(pid);
    }*/

  /*  @Override
    public List<Contract> selectContractLike(String cname) {
        return personnelMapper.selectContractLike(cname);
    }*/
}

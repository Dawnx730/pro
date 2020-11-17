package com.pro.rem.service;

import com.pro.rem.model.Salcon;

import java.util.List;
import java.util.Map;

/**
 * @author xiaoyang
 * @create  2020-11-13 0:57
 */
public interface SalConService {

    int deleteByPrimaryKey(Integer id);

    int insert(Salcon record);

    int insertSelective(Salcon record);

    Salcon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Salcon record);

    int updateByPrimaryKey(Salcon record);

    List<Map> getAllSalCon();

    List<Salcon> getAllSalConById(Salcon salcon);

    List<Map> getRep(Map map);

    void updByID(Salcon salcon);

    void DelByID(Salcon salcon);
}

package com.pro.rem.mapper;

import com.pro.rem.model.Salcon;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SalconMapper {
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
package com.pro.rem.mapper;

import com.pro.rem.model.Timecard;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface TimecardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Timecard record);

    int insertSelective(Timecard record);

    Timecard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Timecard record);

    int updateByPrimaryKey(Timecard record);

    List<Map> getAll();

    List<Map> getRep(Timecard timecard);
}
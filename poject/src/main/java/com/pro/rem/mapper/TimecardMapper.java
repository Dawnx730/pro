package com.pro.rem.mapper;

import com.pro.rem.model.Timecard;

public interface TimecardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Timecard record);

    int insertSelective(Timecard record);

    Timecard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Timecard record);

    int updateByPrimaryKey(Timecard record);
}
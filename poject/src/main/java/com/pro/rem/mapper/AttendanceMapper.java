package com.pro.rem.mapper;

import com.pro.rem.model.Attendance;


public interface AttendanceMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Attendance record);

    int insertSelective(Attendance record);

    Attendance selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Attendance record);

    int updateByPrimaryKey(Attendance record);
}
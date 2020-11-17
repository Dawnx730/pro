package com.pro.rem.mapper;

import com.pro.rem.model.Timecard;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TimecardMapper {
    List<Map> getAll();

    int insert(Timecard record);

    List<Map> getRep(Timecard timecard);

    List<Map> selByName(Map map);

    void updateStatus(Timecard timecard);

    List<Map> selectBySal(Map map);

    void updData(Map map);
}
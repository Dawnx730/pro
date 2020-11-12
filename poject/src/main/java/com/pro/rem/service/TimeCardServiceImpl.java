package com.pro.rem.service;

import com.pro.rem.mapper.TimecardMapper;
import com.pro.rem.model.Timecard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author xiaoyang
 * @create  2020-11-11 16:14
 */
@Service
public class TimeCardServiceImpl implements TimeCardService {

    @Autowired
    private TimecardMapper timecardMapper;
    @Override
    public List<Map> getAll() {
        return timecardMapper.getAll();
    }

    @Override
    public int insert(Timecard record) {
        return timecardMapper.insert(record);
    }

    @Override
    public List<Map> getRep(Timecard timecard) {
        return timecardMapper.getRep(timecard);
    }
}

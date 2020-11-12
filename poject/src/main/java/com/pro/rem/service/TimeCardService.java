package com.pro.rem.service;

import com.pro.rem.model.Timecard;

import java.util.List;
import java.util.Map;

/**
 * @author xiaoyang
 * @create  2020-11-11 16:14
 */
public interface TimeCardService {

    List<Map> getAll();

    int insert(Timecard record);

    List<Map> getRep(Timecard timecard);

}

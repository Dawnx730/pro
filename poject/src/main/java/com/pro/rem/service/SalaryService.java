package com.pro.rem.service;

import com.pro.rem.model.Salary;
import com.pro.rem.model.Timecard;

import java.util.List;
import java.util.Map;

/**
 * @author xiaoyang
 * @create  2020-11-10 22:22
 */
public interface SalaryService {

    int insert(Salary record);

    int insertSelective(Salary record);

    List<Map> SelectById(Map map);

    List<Map> getAll(Map map);

    List<Map> SalaryRep(Timecard timecard);

    Integer approval(Map map);

    void updateSalStatus(Map map);

    void updateSalStatusT(Map map);

    void updSp(Map map);


    void updateSalStatusF(Map map);

    List<Map> getAllBySta(Map map);
}

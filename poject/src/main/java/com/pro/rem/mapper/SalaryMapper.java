package com.pro.rem.mapper;

import com.pro.rem.model.Salary;
import com.pro.rem.model.Timecard;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface SalaryMapper {
    int insert(Salary record);

    int insertSelective(Salary record);

    List<Map> SelectById(Map map);

    List<Map> getAll(Map map);

    List<Map> SalaryRep(Timecard timecard);

    Integer approval(Map map);

    void updateSalStatus(Map map);

    void  updateSalStatusT(Map map);

    void updateSalStatusF(Map map);

    void updSp(Map map);

    List<Map> getAllBySta(Map map);


}
package com.pro.limit.service;

import com.pro.limit.model.Dept;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

/**
 * @author xiaoyang
 * @create  2020-11-11 9:17
 */
public interface DeptService {
    String getDeptById(Dept dept);

    List<Map> getAll();
}

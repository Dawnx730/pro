package com.pro.limit.service;

import com.pro.limit.model.Dept;
import org.springframework.data.repository.query.Param;

/**
 * @author xiaoyang
 * @create  2020-11-11 9:17
 */
public interface DeptService {
    String getDeptById(Dept dept);
}

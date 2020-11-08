package com.pro.limit.mapper;

import com.pro.limit.model.SysRight;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface SysRightMapper {
    List<SysRight> TreeMenu();
}
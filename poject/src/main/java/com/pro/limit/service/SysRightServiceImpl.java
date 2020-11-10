package com.pro.limit.service;

import com.pro.limit.mapper.SysRightMapper;
import com.pro.limit.model.SysRight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author xiaoyang
 * @create  2020-11-06 19:47
 */
@Service
public class SysRightServiceImpl implements SysRightService {

    @Autowired
    private SysRightMapper sysRightMapper;

    @Override
    public List<SysRight> TreeMenu() {
        return sysRightMapper.TreeMenu();
    }

}

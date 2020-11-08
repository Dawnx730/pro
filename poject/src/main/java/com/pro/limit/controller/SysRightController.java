package com.pro.limit.controller;

import com.pro.limit.model.SysRight;
import com.pro.limit.service.SysRightService;
import com.pro.limit.service.SysRightServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author xiaoyang
 * @create  2020-11-06 19:40
 */
@Controller
@RequestMapping("/tree")
public class SysRightController {

    @Autowired
    private SysRightService sysRightService;

    @ResponseBody
    @RequestMapping("/list")
    public List<SysRight> list() {
        List<SysRight> sysRights = sysRightService.TreeMenu();
        return sysRights;
    }

}

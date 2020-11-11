package com.pro.limit.controller;

import com.pro.limit.mapper.DeptMapper;
import com.pro.limit.mapper.UserMapper;
import com.pro.limit.model.Dept;
import com.pro.limit.model.User;
import com.pro.limit.service.DeptService;
import com.pro.limit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xiaoyang
 * @create  2020-11-11 9:15
 */
@Controller
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    //通过部门id查询部门名称
    @ResponseBody
    @RequestMapping(value="/getDept", produces = "text/html;charset=UTF-8;")
    public String getDept(Dept dept) {
        String deptById = deptService.getDeptById(dept);
        return deptById;
    }
}

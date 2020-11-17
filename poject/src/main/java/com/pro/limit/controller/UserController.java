package com.pro.limit.controller;

import com.pro.limit.model.Dept;
import com.pro.limit.model.User;
import com.pro.limit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author xiaoyang
 * @create  2020-11-05 9:35
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登录验证
     *
     * @param u
     * @return
     */
    @ResponseBody
    
    @RequestMapping(value = "/login", produces = "text/html;charset=UTF-8;")
    private String list(User u) {
        User login = userService.login(u);
        System.out.println("+++++++++++++++++++++++++==");
        if (login.getStatus() == 1) {
            return login + "";
        }
        return null;
    }

    // 通过账号查询全部信息
    @ResponseBody
    @RequestMapping("/getAllByAccount")
    public List<User> getAllByAccount(User user) {
        List<User> allByAccount = userService.getAllByAccount(user);
        return allByAccount;
    }

    // 查询用户id
    @ResponseBody
    @RequestMapping("/getId")
    public int getId(User user) {
        Integer getId = userService.getIdByAccount(user);
        return getId;
    }

    //查询用户名
    @ResponseBody
    @RequestMapping("/getName")
    public String getName(User user) {
        String getname = userService.getNameByAccount(user);
        return getname;
    }
    //  通过账号查询权限
    @ResponseBody
    @RequestMapping("/getLevel")
    public Integer getLevel(User user) {
        Integer level = userService.getLevel(user);
        return level;
    }

    //  通过部门id获取员工
    @ResponseBody
    @RequestMapping("/getUserName")
    public List<Map> getLevel(Dept dept) {
        List<Map> nameByDeptId = userService.getNameByDeptId(dept.getDeptid());
        return nameByDeptId;
    }

    //  获取所有员工
    @ResponseBody
    @RequestMapping("/getAll")
    public List<Map> getAll() {
        List<Map> all = userService.getAll();
        return all;
    }

    //  获取所有员工
    @ResponseBody
    @RequestMapping("/selAll")
    public List<Map> selAll() {
        List<Map> all = userService.selectAll();
        return all;
    }
}

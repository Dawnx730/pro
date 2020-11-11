package com.pro.limit.controller;

import com.pro.limit.model.User;
import com.pro.limit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
        if (login.getStatus() == 1) {
            return login + "";
        }
        return null;
    }

    @ResponseBody
    @RequestMapping("/getId")
    public int getIdByName(User user) {
        Integer idByName = userService.getIdByName(user);
        return idByName;
    }
}

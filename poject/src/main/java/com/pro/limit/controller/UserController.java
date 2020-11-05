package com.pro.limit.controller;

import com.pro.limit.model.User;
import com.pro.limit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaoyang
 * @create  2020-11-05 9:35
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    private String list(){
        User user = userService.selectByPrimaryKey(1);
        return user.getUsername();
    }
}

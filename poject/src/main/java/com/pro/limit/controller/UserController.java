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

    @ResponseBody
    @RequestMapping("/login")
    private String list(){
        User u=new User();
        u.setUsername("admin");
        u.setPassword("123");
        User login = userService.login(u);
        if(login!=null){
            return "登录成功";
        }
        return "登录失败";
    }
}

package com.pro.limit.controller;

import com.pro.limit.model.SysRight;
import com.pro.limit.model.User;
import com.pro.limit.service.SysRightService;
import com.pro.limit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoyang
 * @create  2020-11-06 19:40
 */
@Controller
@RequestMapping("/tree")
public class SysRightController {

    @Autowired
    private SysRightService sysRightService;

    @Autowired
    private UserService userService;


    @ResponseBody
    @RequestMapping("/list")
    public List<SysRight> list(User user) {
        Integer level = userService.getLevel(user);
        //级别，权限设计  1、普通员工 2、部门经理 3、管理员
        List<SysRight> sysRights = sysRightService.TreeMenu();
        List<SysRight> list = new ArrayList<>();
        if (level == 3) {
            return sysRights;
        } else if (level == 2) {
            for (SysRight sysRight : sysRights) {
                if (sysRight.getRightNodeType() == 2) {
                    list.add(sysRight);
                }
            }
            return list;
        } else {
            //循环判断权限对应的父节点和子节点
            for (int i = 0; i < sysRights.size(); i++) {
                for (int i1 = 0; i1 < sysRights.get(i).getChildren().size(); i1++) {
                    if(sysRights.get(i).getChildren().get(i1).getRightNodeType()==1){
                        list.add(sysRights.get(i));
                        break;
                    }
                }
            }
            for (int i = 0; i < list.size(); i++) {
                for (int i1 = 0; i1 < list.get(i).getChildren().size(); i1++) {
                    if(list.get(i).getChildren().get(i1).getRightNodeType()!=1){
                        list.get(i).getChildren().remove(i1);
                        i1--;
                    }
                }
            }
            return list;
        }
    }

}

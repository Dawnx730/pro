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
import java.util.Map;

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

    //判断用户权限加载树结构
    @ResponseBody
    @RequestMapping("/list")
    public List<SysRight> test(User user) {
        Integer idByAccount = userService.getIdByAccount(user);
        List<Integer> integers = userService.queryLimitByUserId(idByAccount);
        List<SysRight> list = sysRightService.TreeMenu(integers);
        List<SysRight> newList = new ArrayList<>();
        for (SysRight sysRight : list) {
            if (sysRight.getChildren() != null && sysRight.getChildren().size() > 0) {
                newList.add(sysRight);
            }
        }
        for (int i = 0; i < newList.size(); i++) {
            for (int j = 0; j < newList.get(i).getChildren().size(); j++) {
                if (!integers.contains(newList.get(i).getChildren().get(j).getRightCode())) {
                    newList.get(i).getChildren().remove(j);
                    j--;
                }
            }
        }
        return newList;
    }


}

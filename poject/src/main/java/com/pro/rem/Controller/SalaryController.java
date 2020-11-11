package com.pro.rem.Controller;

import com.pro.limit.model.Dept;
import com.pro.limit.model.User;
import com.pro.limit.service.DeptService;
import com.pro.limit.service.UserService;
import com.pro.rem.model.Salary;
import com.pro.rem.service.SalaryService;
import com.pro.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaoyang
 * @create  2020-11-10 22:24
 */
@Controller
@RequestMapping("/Salary")
public class SalaryController {

    @Autowired
    private SalaryService salaryService;
    @Autowired
    private UserService userService;
    @Autowired
    private DeptService deptService;

    //通过id获取本月薪酬
    @ResponseBody
    @RequestMapping("/list")
    public JSONResult list(User user) {
        Map map = new HashMap<>();
        List<Map> salaries = new ArrayList<>();

        //通过登陆账号先查询权限
        Integer level = userService.getLevel(user);
        if (level == 3) {//如果是管理员，查看所有人的薪酬结构
            map.put("deptName", "%%");
            salaries = salaryService.getAll(map);
        } else if (level == 2) {//经理查询此部门所有人员薪酬
            Integer deptByAccount = userService.getDeptByAccount(user);
            Dept dept = new Dept();
            dept.setDeptid(deptByAccount);
            String deptById = deptService.getDeptById(dept);
            map.put("deptName", "%" + deptById + "%");
            salaries = salaryService.getAll(map);
        } else {//员工查询自己工资
            Integer idByAccount = userService.getIdByAccount(user);
            map.put("userid", idByAccount);
            salaries = salaryService.SelectById(map);
        }
        for (Map salary : salaries) {
            Integer level1 = (Integer) salary.get("level");
            if (level1 == 1) {
                salary.put("level", "员工");
            } else if (level1 == 2) {
                salary.put("level", "经理");
            } else {
                salary.put("level", "管理员");
            }
        }
        return JSONResult.ok(salaries);
    }

}

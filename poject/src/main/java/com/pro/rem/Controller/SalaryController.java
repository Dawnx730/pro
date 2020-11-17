package com.pro.rem.Controller;

import com.pro.limit.model.Dept;
import com.pro.limit.model.User;
import com.pro.limit.service.DeptService;
import com.pro.limit.service.UserService;
import com.pro.rem.model.Salary;
import com.pro.rem.model.Salcon;
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
        if (level >= 3) {//如果是管理员，查看所有人的薪酬结构
            map.put("deptName", "%%");
            map.put("sastatus","%%");
            salaries = salaryService.getAll(map);
        } else if (level == 2) {//经理查询此部门所有人员薪酬
            Integer deptByAccount = userService.getDeptByAccount(user);
            Dept dept = new Dept();
            dept.setDeptid(deptByAccount);
            String deptById = deptService.getDeptById(dept);
            map.put("deptName", "%" + deptById + "%");
            map.put("sastatus","%2%");
            salaries = salaryService.getAll(map);
        } else {//员工查询自己工资
            Integer idByAccount = userService.getIdByAccount(user);
            map.put("userid", idByAccount);
            map.put("sastatus","%2%");
            salaries = salaryService.SelectById(map);
        }
        for (Map salary : salaries) {
            Integer level1 = (Integer) salary.get("level");
            if (level1 == 1) {
                salary.put("level", "员工");
            } else if (level1 == 2) {
                salary.put("level", "经理");
            } else if(level1==3) {
                salary.put("level", "人事专员");
            }else if(level1==4){
                salary.put("level","人事经理");
            }else{
                salary.put("level","管理员");
            }
        }
        return JSONResult.ok(salaries);
    }

    //查询出待审批状态工资条的总数
    @ResponseBody
    @RequestMapping("/approval")
    public Integer approval() {
        Map map=new HashMap();
        map.put("sastatus",1);
        Integer approval = salaryService.approval(map);
        return approval;
    }

    //查询出驳回状态工资条的总数
    @ResponseBody
    @RequestMapping("/pending")
    public Integer pending() {
        Map map=new HashMap();
        map.put("sastatus",4);
        Integer pending = salaryService.approval(map);
        return pending;
    }

    //修改员工薪酬状态为驳回
    @ResponseBody
    @RequestMapping("/updStatus")
    public int updStatus(Salary salary) {
        Map map=new HashMap();
        map.put("sastatus",4);
        map.put("remark",salary.getRemark());
        map.put("id",salary.getUserid());
        salaryService.updateSalStatus(map);
        return 1;
    }
    //修改员工薪酬状态为已审批
    @ResponseBody
    @RequestMapping("/updStatusT")
    public int updStatusT(Salary salary) {
        Map map=new HashMap();
        map.put("sastatus",2);
        map.put("id",salary.getUserid());
        salaryService.updateSalStatusT(map);
        return 1;
    }

    //修改员工薪酬状态为已删除
    @ResponseBody
    @RequestMapping("/updStatusF")
    public int updStatusF(Salary salary) {
        Map map=new HashMap();
        map.put("sastatus",3);
        map.put("id",salary.getUserid());
        salaryService.updateSalStatusF(map);
        return 1;
    }

    //通过状态查询员工薪酬列表
    @ResponseBody
    @RequestMapping("/getAllBySta")
    public List<Map> getAllBySta(Salary salary) {
        Map map=new HashMap();
        map.put("deptName", "%%");
        map.put("sastatus",salary.getSastatus());
        List<Map> allBySta = salaryService.getAllBySta(map);
        return allBySta;
    }
}

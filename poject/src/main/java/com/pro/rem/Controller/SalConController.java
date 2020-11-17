package com.pro.rem.Controller;

import com.pro.rem.model.Salary;
import com.pro.rem.model.Salcon;
import com.pro.rem.model.Timecard;
import com.pro.rem.service.SalConService;
import com.pro.rem.service.SalaryService;
import com.pro.rem.service.TimeCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaoyang
 * @create  2020-11-13 0:58
 */
@Controller
@RequestMapping("/SalCon")
public class SalConController {

    @Autowired
    private SalConService salConService;

    @Autowired
    private TimeCardService timeCardService;

    @Autowired
    private SalaryService salaryService;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<Map> getAll() {
        List<Map> allSalCon = salConService.getAllSalCon();
        return allSalCon;
    }

    //通过员工id获取薪酬结构
    @ResponseBody
    @RequestMapping("/getAllSalConById")
    public List<Salcon> getAllSalConById(Salcon salcon) {
        List<Salcon> allSalCon = salConService.getAllSalConById(salcon);
        return allSalCon;
    }
    //通过员工id修改员工薪酬结构
    @ResponseBody
    @RequestMapping("/updByID")
    public Integer updByID(Salcon salcon) {
        salConService.updByID(salcon);
        return 1;
    }

    //通过员工id删除员工薪酬结构
    @ResponseBody
    @RequestMapping("/delByID")
    public Integer delByID(Salcon salcon) {
        salConService.DelByID(salcon);
        return 1;
    }
    //查询重复薪酬结构
    @ResponseBody
    @RequestMapping("/getRep")
    public Integer getRep(Salcon salcon) {
        Map map=new HashMap();
        map.put("userid",salcon.getUserid());
        List<Map> rep = salConService.getRep(map);
        if(rep.size()>0&&rep!=null){
            return 0;
        }else{
            salConService.insert(salcon);
        }
        return 1;
    }

    //获取薪酬结构+考勤（生成工资单）
    @ResponseBody
    @RequestMapping("/gentSal")
    public List<Map> gentSal() {
        List<Map> all = timeCardService.getAll();//获取所有员工在用的考勤数据
        for (Map map : all) {
            int fid = (int) map.get("fid");//获取员工id
            int work = (int) map.get("work");//获取工作天数
            int ywork = (int) map.get("ywork");//获取应工作天数
            int late = (int) map.get("late");//获取迟到次数
            int leave = (int) map.get("leave");//获取早退次数
            int overtime = (int) map.get("overtime");//获取加班次数
            int tyear = (int) map.get("tyear");//获取所属年份
            int month = (int) map.get("month");//获取所属月份
            Salcon salcon = new Salcon();
            salcon.setUserid(fid);
            List<Salcon> allSalConById = salConService.getAllSalConById(salcon);//获取对应员工的薪酬结构
            //先判断该员工本年本月工资单是否已存在
            Timecard t = new Timecard();
            t.setFid(fid);
            t.setMonth(month);
            t.setTyear(tyear);
            List<Map> maps = salaryService.SalaryRep(t);
            if (maps.size() > 0 && maps != null) {//如果不为空,说明已经存在工资单
                    continue;
            } else {//为空说明暂无此工资单，增加进去
                //依次增加进该员工工资单
                for (Salcon salcon1 : allSalConById) {
                    if (ywork-work <= 0&&late<=0&&leave<=0) {//全勤
                        Salary s = new Salary(fid, salcon1.getWage(), salcon1.getHousefund(), salcon1.getReimbursement(), salcon1.getPaward(), overtime * 100f, salcon1.getInsur(), 200f, 1, month, tyear,
                                salcon1.getWage() + salcon1.getHousefund() + salcon1.getReimbursement() + salcon1.getPaward() + overtime * 100f + 200f,null);
                        //增加
                        salaryService.insert(s);
                    } else  {//缺勤
                        Salary s = new Salary(fid, salcon1.getWage() - (ywork-work) * 100-late*10-leave*10, salcon1.getHousefund(), salcon1.getReimbursement(), salcon1.getPaward(), overtime * 100f, salcon1.getInsur(), 0f, 1, month, tyear,
                                salcon1.getWage() + salcon1.getHousefund() + salcon1.getReimbursement() + salcon1.getPaward() + overtime * 100f + 200f,null);
                        salaryService.insert(s);
                    }
                }
            }
        }
        return all;
    }

}

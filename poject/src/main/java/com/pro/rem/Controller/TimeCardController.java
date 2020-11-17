package com.pro.rem.Controller;

import com.pro.limit.model.User;
import com.pro.rem.model.Timecard;
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
 * @create  2020-11-11 16:15
 */
@Controller
@RequestMapping("/timecard")
public class TimeCardController {

    @Autowired
    private TimeCardService timeCardService;

    @Autowired
    private SalaryService salaryService;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<Map> getAll() {
        List<Map> all = timeCardService.getAll();
        return all;
    }

    @ResponseBody
    @RequestMapping("/insert")
    public String insert(Timecard timecard) {
        System.out.println("------------------------------------------------------------------------");
        int insert = timeCardService.insert(timecard);
        if (insert > 0) {//增加成功返回0
            return "success";
        }
        return "false";
    }

    // 判断考勤数据重复
    @ResponseBody
    @RequestMapping("/rep")
    public Integer rep(Timecard timecard) {
        List<Map> rep = timeCardService.getRep(timecard);
        if (rep != null && rep.size() > 0) {//有此数据返回0
            return 0;
        }
        return 1;
    }

    //    删除考勤数据
    @ResponseBody
    @RequestMapping("/del")
    public Integer del(Timecard timecard) {
        timeCardService.updateStatus(timecard);
        return 0;
    }

    //通过薪酬界面查看指定员工的考勤数据
    @ResponseBody
    @RequestMapping("/BySal")
    public List<Map> BySal(Timecard timecard) {
        Map map = new HashMap();
        map.put("userid", timecard.getFid());
        map.put("smonth", timecard.getMonth());
        map.put("syear", timecard.getTyear());
        List<Map> maps = timeCardService.selectBySal(map);
        return maps;
    }

    //通过员工id修改考勤数据
    @ResponseBody
    @RequestMapping("/updD")
    public Integer updD(Timecard timecard) {
        Map map = new HashMap();
        map.put("fid", timecard.getFid());
        map.put("month", timecard.getMonth());
        map.put("tyear", timecard.getTyear());
        map.put("late", timecard.getLate());
        map.put("leave", timecard.getLeave());
        map.put("overtime", timecard.getOvertime());
        map.put("work", timecard.getWork());
        map.put("ywork", timecard.getWork());
        //同步修改工资条状态为待审批
        Map maps = new HashMap();
        maps.put("id", timecard.getFid());
        maps.put("syear", timecard.getTyear());
        maps.put("smonth", timecard.getMonth());
        salaryService.updSp(maps);
        timeCardService.updData(map);
        return 1;
    }

//    selectBySal
    //    通过员工姓名查询
    @ResponseBody
    @RequestMapping("/selByName")
    public List<Map> selByName(User user) {
        Map map=new HashMap();
        map.put("username",user.getUsername());
        List<Map> all = timeCardService.selByName(map);
        return all;
    }

}


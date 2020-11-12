package com.pro.rem.Controller;

import com.pro.rem.model.Timecard;
import com.pro.rem.service.TimeCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @ResponseBody
    @RequestMapping("/getAll")
    public List<Map> getAll() {
        List<Map> all = timeCardService.getAll();
        return all;
    }

    @ResponseBody
    @RequestMapping("/add")
    public String add(Timecard timecard) {
        int insert = timeCardService.insert(timecard);
        System.out.println("------------------------------------------------------------------------");
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
        if (rep!=null&&rep.size()>0) {//有此数据返回0
            return 0;
        }
        return 1;
    }
}


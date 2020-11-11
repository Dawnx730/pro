package com.pro.rem.Controller;

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
    public List<Map> getAll(){
        List<Map> all = timeCardService.getAll();
        return all;
    }
}

package com.pro.trainingapproval.controller;

import com.pro.limit.model.User;
import com.pro.trainingapproval.model.Userinfo;
import com.pro.trainingapproval.service.TrainingplanService;
import com.pro.trainingapproval.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 炽吃痴
 * @companv xxx公司
 * @create 2020 01 16 18:01
 */
@Controller
@RequestMapping("/Trainingplan")
public class TrainingplanContrller {
    @Autowired
    private TrainingplanService trainingplanService;

    @Autowired
    private UserinfoService userinfoService;

    @ResponseBody
    @RequestMapping(value = "/userinfoadd",produces = "text/html;charset=UTF-8;")
    public String add(Userinfo ufo){
        ufo.setFid(1);
        ufo.setFname("小明");
        ufo.setDeptid(1);
        ufo.setPosition("销售经理");
        ufo.setFtel(1329864199);
        ufo.setFsex("男");
        ufo.setBirth("2000-2-23");
        ufo.setEdu("本科");
        ufo.setNat("中国");
        ufo.setFstatus(1);
        return "";
    }



    @ResponseBody
    @RequestMapping(value = "/add",produces = "text/html;charset=UTF-8;")
    public String add(Userinfo ufo,Integer fid){

        if(ufo.getFid()==fid){

        }
        return "";
    }
}

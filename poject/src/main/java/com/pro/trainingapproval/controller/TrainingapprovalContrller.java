package com.pro.trainingapproval.controller;

import com.pro.trainingapproval.model.Trainingapproval;
import com.pro.trainingapproval.service.TrainingapprovalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 邦无敌
 * @site https://blog.csdn.net/YoonBongChi
 * @compsny 邦无敌公司
 * @create 2020-11-11-12:26
 */
@Controller
@RequestMapping("/Trainingapproval")
public class TrainingapprovalContrller {

    @Autowired
    private TrainingapprovalService trainingapprovalService;

    @ResponseBody
    @RequestMapping(value = "/add",produces = "text/html;charset=UTF-8;")
    public String Add(Trainingapproval trainingapproval){
        trainingapproval.setTaid(1);
        trainingapproval.setUserid(1);
        trainingapproval.setTrf("ss迁都ji");
        trainingapproval.setFzr("银棒吃");
        trainingapproval.setTrmark(1);
        trainingapproval.setDeptid(1);
        trainingapproval.setTstatus(1);
        this.trainingapprovalService.insert(trainingapproval);
        return "你好";
    }

}

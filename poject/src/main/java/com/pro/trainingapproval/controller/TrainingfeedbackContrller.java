package com.pro.trainingapproval.controller;

import com.pro.trainingapproval.model.Trainingfeedback;
import com.pro.trainingapproval.service.TrainingfeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 炽吃痴
 * @companv xxx公司
 * @create 2020 01 16 18:01
 */
@Controller
@RequestMapping("/Trainingfeedback")
public class TrainingfeedbackContrller {
    @Autowired
    private TrainingfeedbackService trainingfeedbackService;

    @ResponseBody
    @RequestMapping(value="/add", produces = "text/html;charset=UTF-8;")
    public String Add(Trainingfeedback trainingfeedback){
        trainingfeedback.setTfid(1);
        trainingfeedback.setUserid(1);
        trainingfeedback.setUsername("小李");
        trainingfeedback.setTrf("ss迁都ji");
        trainingfeedback.setTrfk("hehao");
        trainingfeedback.setFstatus(1);
        this.trainingfeedbackService.insert(trainingfeedback);
        return  "增加成功";
    }
}

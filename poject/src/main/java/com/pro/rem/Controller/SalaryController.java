package com.pro.rem.Controller;

import com.pro.limit.model.User;
import com.pro.rem.model.Salary;
import com.pro.rem.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author xiaoyang
 * @create  2020-11-10 22:24
 */
@Controller
@RequestMapping("/Salary")
public class SalaryController {

    @Autowired
    private SalaryService salaryService;

     //通过id获取本月薪酬
    @ResponseBody
    @RequestMapping("/list")
    public List<Salary> list(User user) {
        List<Salary> salaries = salaryService.SelectById(user);
        return salaries;
    }

}

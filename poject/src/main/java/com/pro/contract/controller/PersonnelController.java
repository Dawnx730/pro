package com.pro.contract.controller;
import com.pro.contract.model.Personnel;
import com.pro.contract.service.PersonnelService;
import com.pro.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author wang
 * @site https://blog.csdn.net/qq_45432593
 * @create 2020-11-06  14:36
 */
@Controller
public class PersonnelController {
      
    @Autowired
    private  PersonnelService personnelService;

    @RequestMapping("/deleteByPrimaryKey")
    public  String deleteByPrimaryKey(HttpServletRequest req){

        return  "redirect:/Personnel/list";
    }
    @RequestMapping("/insert")
    public  String insert(HttpServletRequest req){

        return  "redirect:/Personnel/list";
    }
    @RequestMapping("/insertSelective")
    public  String insertSelective(HttpServletRequest req){

        return  "redirect:/Personnel/list";
    }
    @RequestMapping("/selectByPrimaryKey")
    public  String selectByPrimaryKey(HttpServletRequest req){

        return  "redirectList";
    }
    @RequestMapping("/updateByPrimaryKeySelective")
    public  String updateByPrimaryKeySelective(HttpServletRequest req){

        return  "redirect:/Personnel/list";
    }
    @RequestMapping("/updateByPrimaryKey")
    public  String updateByPrimaryKey(HttpServletRequest req){

        return  "redirect:/Personnel/list";
    }
    @RequestMapping("/selectPersonnel")
    public  String selectPersonnel(Personnel personnel, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);

        return  "redirectList";
    }
    @RequestMapping("/selectContractLike")
    public  String selectContractLike(HttpServletRequest req){

        return  "redirectList";
    }




}

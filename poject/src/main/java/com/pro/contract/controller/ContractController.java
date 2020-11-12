package com.pro.contract.controller;

import com.pro.contract.service.ContractService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wang
 * @site https://blog.csdn.net/qq_45432593
 * @create 2020-11-06  14:01
 */
@Controller
public class ContractController {

    private ContractService contractService;

    @RequestMapping("/Contoract")
    public  String deleteByPrimaryKey(HttpServletRequest req){
        return  "redirect:/Contoract/list";
    }

    @RequestMapping("/Contoract")
    public  String insert(HttpServletRequest req){
        return  "redirect:/Contoract/list";
    }
    @RequestMapping("/Contoract")
    public  String insertSelective(HttpServletRequest req){
        return  "redirect:/Contoract/list";
    }
    @RequestMapping("/Contoract")
    public  String selectByPrimaryKey(HttpServletRequest req){
        return  "redirect:/Contoract/list";
    }
    @RequestMapping("/Contoract")
    public  String updateByPrimaryKeySelective(HttpServletRequest req){
        return  "redirect:/Contoract/list";
    }
    @RequestMapping("/Contoract")
    public  String updateByPrimaryKey(HttpServletRequest req){
        return  "redirect:/Contoract/list";
    }
    @RequestMapping("/Contoract")
    public  String selectContract(HttpServletRequest req){
        return  "redirect:/Contoract/list";
    }

    @RequestMapping("/Contoract")
    public  String selectContractLike(HttpServletRequest req){
        return  "redirectList";
    }


}

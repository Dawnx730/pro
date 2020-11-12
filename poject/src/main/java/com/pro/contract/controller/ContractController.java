package com.pro.contract.controller;
import com.pro.contract.model.Contract;
import com.pro.contract.service.ContractService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

/*
 * @author wang
 * @site https://blog.csdn.net/qq_45432593
 * @create 2020-11-06  14:01
 */
@Controller
@RequestMapping("/ContractController")
public class ContractController {

    private ContractService contractService;

    @RequestMapping("/deleteByPrimaryKey")
    public  String deleteByPrimaryKey(Contract contract, HttpServletRequest req){
        if(contract != null && contract.getId() !=0){
            this.contractService.deleteByPrimaryKey(contract.getId());

        }
        return  "redirect:/Contoract/list";
    }

    @RequestMapping("/insert")
    public  String insert(HttpServletRequest req){
        return  "redirect:/Contoract/list";
    }
    @RequestMapping("/insertSelective")
    public  String insertSelective(HttpServletRequest req){
        return  "redirect:/Contoract/list";
    }
    @RequestMapping("/selectByPrimaryKey")
    public  String selectByPrimaryKey(HttpServletRequest req){
        return  "redirect:/Contoract/list";
    }
    @RequestMapping("/updateByPrimaryKeySelective")
    public  String updateByPrimaryKeySelective(HttpServletRequest req){
        return  "redirect:/Contoract/list";
    }
    @RequestMapping("/updateByPrimaryKey")
    public  String updateByPrimaryKey(HttpServletRequest req){
        return  "redirect:/Contoract/list";
    }
    @RequestMapping("/selectContract")
    public  String selectContract(HttpServletRequest req){
        return  "redirect:/Contoract/list";
    }

    @RequestMapping("/selectContractLike")
    public  String selectContractLike(HttpServletRequest req){
        return  "redirectList";
    }


}

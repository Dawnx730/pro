package com.pro.contract.controller;

import com.pro.contract.model.Personnel;
import com.pro.contract.model.contract;
import com.pro.contract.service.ContractService;
import com.pro.contract.service.PersonnelService;
import com.pro.util.JSONResult;
import com.pro.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wang
 * @site https://blog.csdn.net/qq_45432593
 * @create 2020-11-16  19:24
 */

@Controller
@RequestMapping("/contract")
public class ContractController {


    @Autowired
    private ContractService contractService;
    private PersonnelService personnelService;

  @ResponseBody
  @RequestMapping("listPager")
    public JSONResult listPager(HttpServletRequest request, PageBean pageBean){
      Map map=new HashMap();
     // String cname=request.getParameter("cname");

      List<Map> list=this.contractService.listPager(map,null);
      System.out.println("总数"+pageBean.getTotal());
      return  JSONResult.ok(list,pageBean.getTotal());
  }

  @RequestMapping("/add")
   public  JSONResult add(Personnel personnel, contract contract , HttpServletRequest request){
      Integer n= this.contractService.insert(contract);
      Integer nn=this.personnelService.insert(personnel);
      return JSONResult.build(n,"增加成功",null);

  }

  @RequestMapping("/Contractdel")
    public  JSONResult Contractdel(HttpServletRequest request){
      String id=request.getParameter("id");
      System.out.println("111"+id);
      Integer i=this.contractService.deleteByPrimaryKey(Integer.parseInt(id));
      return  JSONResult.build(i,i==1?"删除成功":"删除失败",null);

  }

  @RequestMapping("/edit")
    public  JSONResult edit(contract contract,HttpServletRequest request){
      Integer i=this.contractService.updateByPrimaryKeySelective(contract);
      return  JSONResult.build(i,"修改成功",null);
  }

}

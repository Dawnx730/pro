package com.pro.contract.controller;
import com.pro.contract.model.Personnel;
import com.pro.contract.service.PersonnelService;
import com.pro.util.JSONResult;
import com.pro.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wang
 * @site https://blog.csdn.net/qq_45432593
 * @create 2020-11-06  14:36
 */

@Controller
@RequestMapping("/Personnel")
public class PersonnelController {
      
    @Autowired
    private  PersonnelService personnelService;

    @ResponseBody
    @RequestMapping("listPager")
    public JSONResult listPager(HttpServletRequest request,PageBean pageBean){
        Map map=new HashMap();
//        String fname=request.getParameter("fname");
        List<Map> list=this.personnelService.listPager(map,null);
        System.out.println("总数"+pageBean.getTotal());
        return JSONResult.ok(list,pageBean.getTotal());
    }

    @RequestMapping("/add")
    public JSONResult add(Personnel personnel,HttpServletRequest request){
          Integer n=this.personnelService.insertSelective(personnel);
        return  JSONResult.build(n,"增加成功",null);
    }

    @RequestMapping("/del")
    public JSONResult del(HttpServletRequest request){
        String id=request.getParameter("id");
        System.out.println("111"+id);
        Integer i=this.personnelService.deleteByPrimaryKey(Integer.parseInt(id));
        return  JSONResult.build(i,i==1?"删除成功":"删除失败",null);
    }
    @RequestMapping("/edit")
    public  JSONResult edit(Personnel personnel,HttpServletRequest request){
        Integer i=this.personnelService.updateByPrimaryKeySelective(personnel);
        return JSONResult.build(i,"修改成功",null);
    }
}
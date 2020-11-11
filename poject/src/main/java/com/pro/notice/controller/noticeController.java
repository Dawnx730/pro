package com.pro.notice.controller;
import com.pro.notice.model.Notice;
import com.pro.notice.service.NoticeService;
import com.pro.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


    @Controller
    @RequestMapping("/notice")
    public class noticeController {
        @Autowired
        private NoticeService noticeService;
        @RequestMapping("/list")
        public String list(Notice notice, HttpServletRequest req){
            PageBean pageBean=new PageBean();
            pageBean.setRequest(req);
            List<Notice> notices = noticeService.listPager(notice, pageBean);
            req.setAttribute("noticeList",notice);
            req.setAttribute("pageBean",pageBean);
            return "noticeList";
        }
        @RequestMapping("/add")
        public String add(Notice notice,HttpServletRequest req){
            this.noticeService.insertSelective(notice);
            return "redirect:/notice/list";
        }

        @RequestMapping("/edit")
        public String edit(Notice notice,HttpServletRequest req){
            this.noticeService.updateByPrimaryKeySelective(notice);
            return "redirect:/notice/list";
        }

        @RequestMapping("/del/{nid}")
        public String del(@PathVariable("nid") Integer nid, HttpServletRequest req){
            this.noticeService.deleteByPrimaryKey(nid);
            return "redirect:/notice/list";
        }







}

package com.pro.notice.service;

import com.pro.notice.model.Notice;
import com.pro.util.PageBean;

import java.util.List;
import java.util.Map;

public interface NoticeService {
    int deleteByPrimaryKey(Integer nid);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Integer nid);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);

    List<Map> Nntice(Map map, PageBean pageBean);

    List<Map> listPager(Map map, PageBean pageBean);


    List<Notice> listPager(Notice notice, PageBean pageBean);
}

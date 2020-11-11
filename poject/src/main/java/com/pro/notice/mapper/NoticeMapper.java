package com.pro.notice.mapper;

import com.pro.notice.model.Notice;
import com.pro.util.PageBean;

import java.util.List;
import java.util.Map;

public interface NoticeMapper {
    int deleteByPrimaryKey(Integer nid);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Integer nid);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);

    List<Map> Nntice (Map map);

    List<Notice>MvclistPager(Notice notice);
}
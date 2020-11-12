package com.pro.notice.service.impl;

import com.pro.notice.mapper.NoticeMapper;
import com.pro.notice.model.Notice;
import com.pro.notice.service.NoticeService;
import com.pro.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;
    @Override
    public int deleteByPrimaryKey(Integer nid) {
        return noticeMapper.deleteByPrimaryKey(nid);
    }

    @Override
    public int insert(Notice record) {
        return noticeMapper.insert(record);
    }

    @Override
    public int insertSelective(Notice record) {
        return noticeMapper.insertSelective(record);
    }

    @Override
    public Notice selectByPrimaryKey(Integer nid) {
        return noticeMapper.selectByPrimaryKey(nid);
    }

    @Override
    public int updateByPrimaryKeySelective(Notice record) {
        return noticeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Notice record) {
        return noticeMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Map> Nntice(Map map, PageBean pageBean) {
        return noticeMapper.Nntice(map);
    }

    @Override
    public List<Map> listPager(Map map, PageBean pageBean) {
        return noticeMapper.Nntice(map);
    }

    @Override
    public List<Notice> listPager(Notice notice, PageBean pageBean) {
        return noticeMapper.MvclistPager(notice);
    }
}

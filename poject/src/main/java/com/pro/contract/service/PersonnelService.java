package com.pro.contract.service;

import com.pro.contract.model.Personnel;
import com.pro.util.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author wang
 * @site https://blog.csdn.net/qq_45432593
 * @create 2020-11-06  14:32
 */
public interface PersonnelService {

    //刪除
    int deleteByPrimaryKey(Integer pid);

    int insert(Personnel record);
    //增加
    int insertSelective(Personnel record);

    Personnel selectByPrimaryKey(Integer pid);

    //修改
    int updateByPrimaryKeySelective(Personnel record);

    int updateByPrimaryKey(Personnel record);

    List<Map> listPager(Map map, PageBean pageBean);

    Personnel quanPersonnel(String cname);

}

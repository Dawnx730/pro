package com.pro.limit.service;

import com.pro.limit.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author xiaoyang
 * @create  2020-11-05 9:32
 */
public interface UserService {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User login(User user);

    Integer getLevel(User user);

    Integer getIdByAccount(User user);

    Integer getDeptByAccount(User user);

    String getNameByAccount(User user);

    List<User> getAllByAccount(User user);

    List<Map> getNameByDeptId(@Param("fid") Integer fid);

    List<Map> getAll();

    List<Map> selectAll();

    List<Integer> queryLimitByUserId(@Param("id") Integer id);
}

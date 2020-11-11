package com.pro.limit.mapper;

import com.pro.limit.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
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

}
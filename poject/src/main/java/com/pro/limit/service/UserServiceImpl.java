package com.pro.limit.service;

import com.pro.limit.mapper.UserMapper;
import com.pro.limit.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author xiaoyang
 * @create  2020-11-05 9:32
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return userMapper.deleteByPrimaryKey(userid);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer userid) {
        return userMapper.selectByPrimaryKey(userid);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public Integer getLevel(User user) {
        return userMapper.getLevel(user);
    }

    @Override
    public Integer getIdByAccount(User user) {
        return userMapper.getIdByAccount(user);
    }

    @Override
    public Integer getDeptByAccount(User user) {
        return userMapper.getDeptByAccount(user);
    }

    @Override
    public String getNameByAccount(User user) {
        return userMapper.getNameByAccount(user);
    }

    @Override
    public List<User> getAllByAccount(User user) {
        return userMapper.getAllByAccount(user);
    }

    @Override
    public List<Map> getNameByDeptId(Integer fid) {
        return userMapper.getNameByDeptId(fid);
    }

    @Override
    public List<Map> getAll() {
        return userMapper.getAll();
    }

    @Override
    public List<Map> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public List<Integer> queryLimitByUserId(Integer id) {
        return userMapper.queryLimitByUserId(id);
    }


}

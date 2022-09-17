/**
 * @mbg.generated generator on Sat Sep 17 13:26:33 CST 2022
 */
package com.lenjoy.modules.forum.service.impl;

import com.lenjoy.modules.forum.entity.User;
import com.lenjoy.modules.forum.mapper.UserMapper;
import com.lenjoy.modules.forum.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User row) {
        return userMapper.insert(row);
    }

    @Override
    public int insertSelective(User row) {
        return userMapper.insertSelective(row);
    }

    @Override
    public User selectByPrimaryKey(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User row) {
        return userMapper.updateByPrimaryKeySelective(row);
    }

    @Override
    public int updateByPrimaryKey(User row) {
        return userMapper.updateByPrimaryKey(row);
    }
}
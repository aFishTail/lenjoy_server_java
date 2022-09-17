package com.lenjoy.modules.forum.mapper;

import com.lenjoy.modules.forum.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User row);

    int insertSelective(User row);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User row);

    int updateByPrimaryKey(User row);
}
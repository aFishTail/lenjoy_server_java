package com.lenjoy.modules.forum.mapper;

import com.lenjoy.modules.forum.entity.Message;

public interface MessageMapper {
    int deleteByPrimaryKey(String id);

    int insert(Message row);

    int insertSelective(Message row);

    Message selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Message row);

    int updateByPrimaryKey(Message row);
}
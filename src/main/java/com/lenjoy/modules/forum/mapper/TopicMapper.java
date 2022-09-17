package com.lenjoy.modules.forum.mapper;

import com.lenjoy.modules.forum.entity.Topic;

public interface TopicMapper {
    int deleteByPrimaryKey(String id);

    int insert(Topic row);

    int insertSelective(Topic row);

    Topic selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Topic row);

    int updateByPrimaryKey(Topic row);
}
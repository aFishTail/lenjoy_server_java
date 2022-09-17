package com.lenjoy.modules.forum.mapper;

import com.lenjoy.modules.forum.entity.Comment;

public interface CommentMapper {
    int deleteByPrimaryKey(String id);

    int insert(Comment row);

    int insertSelective(Comment row);

    Comment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Comment row);

    int updateByPrimaryKey(Comment row);
}
package com.lenjoy.modules.forum.mapper;

import com.lenjoy.modules.forum.entity.UserLike;

public interface UserLikeMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserLike row);

    int insertSelective(UserLike row);

    UserLike selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserLike row);

    int updateByPrimaryKey(UserLike row);
}
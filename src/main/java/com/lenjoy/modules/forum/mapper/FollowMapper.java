package com.lenjoy.modules.forum.mapper;

import com.lenjoy.modules.forum.entity.Follow;

public interface FollowMapper {
    int deleteByPrimaryKey(String id);

    int insert(Follow row);

    int insertSelective(Follow row);

    Follow selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Follow row);

    int updateByPrimaryKey(Follow row);
}
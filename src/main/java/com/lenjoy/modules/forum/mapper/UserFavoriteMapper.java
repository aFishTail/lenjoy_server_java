package com.lenjoy.modules.forum.mapper;

import com.lenjoy.modules.forum.entity.UserFavorite;

public interface UserFavoriteMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserFavorite row);

    int insertSelective(UserFavorite row);

    UserFavorite selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserFavorite row);

    int updateByPrimaryKey(UserFavorite row);
}
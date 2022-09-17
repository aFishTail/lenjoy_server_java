/**
 * @mbg.generated generator on Sat Sep 17 13:24:20 CST 2022
 */
package com.lenjoy.modules.forum.service;

import com.lenjoy.modules.forum.entity.UserFavorite;

public interface UserFavoriteService {
    int deleteByPrimaryKey(String id);

    int insert(UserFavorite row);

    int insertSelective(UserFavorite row);

    UserFavorite selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserFavorite row);

    int updateByPrimaryKey(UserFavorite row);
}
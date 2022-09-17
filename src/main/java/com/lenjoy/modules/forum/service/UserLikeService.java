/**
 * @mbg.generated generator on Sat Sep 17 13:25:10 CST 2022
 */
package com.lenjoy.modules.forum.service;

import com.lenjoy.modules.forum.entity.UserLike;

public interface UserLikeService {
    int deleteByPrimaryKey(String id);

    int insert(UserLike row);

    int insertSelective(UserLike row);

    UserLike selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserLike row);

    int updateByPrimaryKey(UserLike row);
}
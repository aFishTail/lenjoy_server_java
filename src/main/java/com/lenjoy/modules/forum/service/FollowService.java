/**
 * @mbg.generated generator on Sat Sep 17 13:22:49 CST 2022
 */
package com.lenjoy.modules.forum.service;

import com.lenjoy.modules.forum.entity.Follow;

public interface FollowService {
    int deleteByPrimaryKey(String id);

    int insert(Follow row);

    int insertSelective(Follow row);

    Follow selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Follow row);

    int updateByPrimaryKey(Follow row);
}
/**
 * @mbg.generated generator on Sat Sep 17 13:26:33 CST 2022
 */
package com.lenjoy.modules.forum.service;

import com.lenjoy.modules.forum.entity.User;

public interface UserService {
    int deleteByPrimaryKey(String id);

    int insert(User row);

    int insertSelective(User row);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User row);

    int updateByPrimaryKey(User row);
}
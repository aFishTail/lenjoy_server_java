/**
 * @mbg.generated generator on Sat Sep 17 13:24:27 CST 2022
 */
package com.lenjoy.modules.forum.service;

import com.lenjoy.modules.forum.entity.Topic;

public interface TopicService {
    int deleteByPrimaryKey(String id);

    int insert(Topic row);

    int insertSelective(Topic row);

    Topic selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Topic row);

    int updateByPrimaryKey(Topic row);
}
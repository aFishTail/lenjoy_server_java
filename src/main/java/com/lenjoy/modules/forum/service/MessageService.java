/**
 * @mbg.generated generator on Sat Sep 17 13:22:45 CST 2022
 */
package com.lenjoy.modules.forum.service;

import com.lenjoy.modules.forum.entity.Message;

public interface MessageService {
    int deleteByPrimaryKey(String id);

    int insert(Message row);

    int insertSelective(Message row);

    Message selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Message row);

    int updateByPrimaryKey(Message row);
}
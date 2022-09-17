/**
 * @mbg.generated generator on Sat Sep 17 13:19:13 CST 2022
 */
package com.lenjoy.modules.forum.service;

import com.lenjoy.modules.forum.entity.Comment;

public interface CommentService {
    int deleteByPrimaryKey(String id);

    int insert(Comment row);

    int insertSelective(Comment row);

    Comment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Comment row);

    int updateByPrimaryKey(Comment row);
}
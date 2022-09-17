/**
 * @mbg.generated generator on Sat Sep 17 13:19:13 CST 2022
 */
package com.lenjoy.modules.forum.service.impl;

import com.lenjoy.modules.forum.entity.Comment;
import com.lenjoy.modules.forum.mapper.CommentMapper;
import com.lenjoy.modules.forum.service.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    private final CommentMapper commentMapper;

    public CommentServiceImpl(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return commentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Comment row) {
        return commentMapper.insert(row);
    }

    @Override
    public int insertSelective(Comment row) {
        return commentMapper.insertSelective(row);
    }

    @Override
    public Comment selectByPrimaryKey(String id) {
        return commentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Comment row) {
        return commentMapper.updateByPrimaryKeySelective(row);
    }

    @Override
    public int updateByPrimaryKey(Comment row) {
        return commentMapper.updateByPrimaryKey(row);
    }
}
/**
 * @mbg.generated generator on Sat Sep 17 13:25:10 CST 2022
 */
package com.lenjoy.modules.forum.service.impl;

import com.lenjoy.modules.forum.entity.UserLike;
import com.lenjoy.modules.forum.mapper.UserLikeMapper;
import com.lenjoy.modules.forum.service.UserLikeService;
import org.springframework.stereotype.Service;

@Service
public class UserLikeServiceImpl implements UserLikeService {
    private final UserLikeMapper userLikeMapper;

    public UserLikeServiceImpl(UserLikeMapper userLikeMapper) {
        this.userLikeMapper = userLikeMapper;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return userLikeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserLike row) {
        return userLikeMapper.insert(row);
    }

    @Override
    public int insertSelective(UserLike row) {
        return userLikeMapper.insertSelective(row);
    }

    @Override
    public UserLike selectByPrimaryKey(String id) {
        return userLikeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserLike row) {
        return userLikeMapper.updateByPrimaryKeySelective(row);
    }

    @Override
    public int updateByPrimaryKey(UserLike row) {
        return userLikeMapper.updateByPrimaryKey(row);
    }
}
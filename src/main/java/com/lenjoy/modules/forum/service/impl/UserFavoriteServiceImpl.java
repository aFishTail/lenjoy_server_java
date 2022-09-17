/**
 * @mbg.generated generator on Sat Sep 17 13:24:20 CST 2022
 */
package com.lenjoy.modules.forum.service.impl;

import com.lenjoy.modules.forum.entity.UserFavorite;
import com.lenjoy.modules.forum.mapper.UserFavoriteMapper;
import com.lenjoy.modules.forum.service.UserFavoriteService;
import org.springframework.stereotype.Service;

@Service
public class UserFavoriteServiceImpl implements UserFavoriteService {
    private final UserFavoriteMapper userFavoriteMapper;

    public UserFavoriteServiceImpl(UserFavoriteMapper userFavoriteMapper) {
        this.userFavoriteMapper = userFavoriteMapper;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return userFavoriteMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserFavorite row) {
        return userFavoriteMapper.insert(row);
    }

    @Override
    public int insertSelective(UserFavorite row) {
        return userFavoriteMapper.insertSelective(row);
    }

    @Override
    public UserFavorite selectByPrimaryKey(String id) {
        return userFavoriteMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserFavorite row) {
        return userFavoriteMapper.updateByPrimaryKeySelective(row);
    }

    @Override
    public int updateByPrimaryKey(UserFavorite row) {
        return userFavoriteMapper.updateByPrimaryKey(row);
    }
}
/**
 * @mbg.generated generator on Sat Sep 17 13:22:49 CST 2022
 */
package com.lenjoy.modules.forum.service.impl;

import com.lenjoy.modules.forum.entity.Follow;
import com.lenjoy.modules.forum.mapper.FollowMapper;
import com.lenjoy.modules.forum.service.FollowService;
import org.springframework.stereotype.Service;

@Service
public class FollowServiceImpl implements FollowService {
    private final FollowMapper followMapper;

    public FollowServiceImpl(FollowMapper followMapper) {
        this.followMapper = followMapper;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return followMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Follow row) {
        return followMapper.insert(row);
    }

    @Override
    public int insertSelective(Follow row) {
        return followMapper.insertSelective(row);
    }

    @Override
    public Follow selectByPrimaryKey(String id) {
        return followMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Follow row) {
        return followMapper.updateByPrimaryKeySelective(row);
    }

    @Override
    public int updateByPrimaryKey(Follow row) {
        return followMapper.updateByPrimaryKey(row);
    }
}
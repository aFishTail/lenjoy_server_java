/**
 * @mbg.generated generator on Sat Sep 17 13:22:41 CST 2022
 */
package com.lenjoy.modules.forum.service.impl;

import com.lenjoy.modules.forum.entity.Score;
import com.lenjoy.modules.forum.mapper.ScoreMapper;
import com.lenjoy.modules.forum.service.ScoreService;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImpl implements ScoreService {
    private final ScoreMapper scoreMapper;

    public ScoreServiceImpl(ScoreMapper scoreMapper) {
        this.scoreMapper = scoreMapper;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return scoreMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Score row) {
        return scoreMapper.insert(row);
    }

    @Override
    public int insertSelective(Score row) {
        return scoreMapper.insertSelective(row);
    }

    @Override
    public Score selectByPrimaryKey(String id) {
        return scoreMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Score row) {
        return scoreMapper.updateByPrimaryKeySelective(row);
    }

    @Override
    public int updateByPrimaryKey(Score row) {
        return scoreMapper.updateByPrimaryKey(row);
    }
}
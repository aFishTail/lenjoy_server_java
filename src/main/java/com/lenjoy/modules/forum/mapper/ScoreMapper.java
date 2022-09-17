package com.lenjoy.modules.forum.mapper;

import com.lenjoy.modules.forum.entity.Score;

public interface ScoreMapper {
    int deleteByPrimaryKey(String id);

    int insert(Score row);

    int insertSelective(Score row);

    Score selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Score row);

    int updateByPrimaryKey(Score row);
}
/**
 * @mbg.generated generator on Sat Sep 17 13:22:41 CST 2022
 */
package com.lenjoy.modules.forum.service;

import com.lenjoy.modules.forum.entity.Score;

public interface ScoreService {
    int deleteByPrimaryKey(String id);

    int insert(Score row);

    int insertSelective(Score row);

    Score selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Score row);

    int updateByPrimaryKey(Score row);
}
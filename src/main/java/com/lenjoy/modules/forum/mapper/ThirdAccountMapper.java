package com.lenjoy.modules.forum.mapper;

import com.lenjoy.modules.forum.entity.ThirdAccount;

public interface ThirdAccountMapper {
    int deleteByPrimaryKey(String id);

    int insert(ThirdAccount row);

    int insertSelective(ThirdAccount row);

    ThirdAccount selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ThirdAccount row);

    int updateByPrimaryKey(ThirdAccount row);
}
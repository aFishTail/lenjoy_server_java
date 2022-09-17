package com.lenjoy.modules.forum.mapper;

import com.lenjoy.modules.forum.entity.EmailCode;

public interface EmailCodeMapper {
    int deleteByPrimaryKey(String id);

    int insert(EmailCode row);

    int insertSelective(EmailCode row);

    EmailCode selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(EmailCode row);

    int updateByPrimaryKey(EmailCode row);
}
/**
 * @mbg.generated generator on Sat Sep 17 13:22:52 CST 2022
 */
package com.lenjoy.modules.forum.service;

import com.lenjoy.modules.forum.entity.EmailCode;

public interface EmailCodeService {
    int deleteByPrimaryKey(String id);

    int insert(EmailCode row);

    int insertSelective(EmailCode row);

    EmailCode selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(EmailCode row);

    int updateByPrimaryKey(EmailCode row);
}
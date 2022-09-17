/**
 * @mbg.generated generator on Sat Sep 17 13:22:37 CST 2022
 */
package com.lenjoy.modules.forum.service;

import com.lenjoy.modules.forum.entity.ThirdAccount;

public interface ThirdAccountService {
    int deleteByPrimaryKey(String id);

    int insert(ThirdAccount row);

    int insertSelective(ThirdAccount row);

    ThirdAccount selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ThirdAccount row);

    int updateByPrimaryKey(ThirdAccount row);
}
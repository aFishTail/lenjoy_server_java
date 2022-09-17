/**
 * @mbg.generated generator on Sat Sep 17 13:22:37 CST 2022
 */
package com.lenjoy.modules.forum.service.impl;

import com.lenjoy.modules.forum.entity.ThirdAccount;
import com.lenjoy.modules.forum.mapper.ThirdAccountMapper;
import com.lenjoy.modules.forum.service.ThirdAccountService;
import org.springframework.stereotype.Service;

@Service
public class ThirdAccountServiceImpl implements ThirdAccountService {
    private final ThirdAccountMapper thirdAccountMapper;

    public ThirdAccountServiceImpl(ThirdAccountMapper thirdAccountMapper) {
        this.thirdAccountMapper = thirdAccountMapper;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return thirdAccountMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ThirdAccount row) {
        return thirdAccountMapper.insert(row);
    }

    @Override
    public int insertSelective(ThirdAccount row) {
        return thirdAccountMapper.insertSelective(row);
    }

    @Override
    public ThirdAccount selectByPrimaryKey(String id) {
        return thirdAccountMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ThirdAccount row) {
        return thirdAccountMapper.updateByPrimaryKeySelective(row);
    }

    @Override
    public int updateByPrimaryKey(ThirdAccount row) {
        return thirdAccountMapper.updateByPrimaryKey(row);
    }
}
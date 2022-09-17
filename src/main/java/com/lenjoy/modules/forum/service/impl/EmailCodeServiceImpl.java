/**
 * @mbg.generated generator on Sat Sep 17 13:22:52 CST 2022
 */
package com.lenjoy.modules.forum.service.impl;

import com.lenjoy.modules.forum.entity.EmailCode;
import com.lenjoy.modules.forum.mapper.EmailCodeMapper;
import com.lenjoy.modules.forum.service.EmailCodeService;
import org.springframework.stereotype.Service;

@Service
public class EmailCodeServiceImpl implements EmailCodeService {
    private final EmailCodeMapper emailCodeMapper;

    public EmailCodeServiceImpl(EmailCodeMapper emailCodeMapper) {
        this.emailCodeMapper = emailCodeMapper;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return emailCodeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(EmailCode row) {
        return emailCodeMapper.insert(row);
    }

    @Override
    public int insertSelective(EmailCode row) {
        return emailCodeMapper.insertSelective(row);
    }

    @Override
    public EmailCode selectByPrimaryKey(String id) {
        return emailCodeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(EmailCode row) {
        return emailCodeMapper.updateByPrimaryKeySelective(row);
    }

    @Override
    public int updateByPrimaryKey(EmailCode row) {
        return emailCodeMapper.updateByPrimaryKey(row);
    }
}
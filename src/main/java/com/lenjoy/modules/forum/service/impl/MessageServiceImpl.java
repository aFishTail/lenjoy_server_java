/**
 * @mbg.generated generator on Sat Sep 17 13:22:45 CST 2022
 */
package com.lenjoy.modules.forum.service.impl;

import com.lenjoy.modules.forum.entity.Message;
import com.lenjoy.modules.forum.mapper.MessageMapper;
import com.lenjoy.modules.forum.service.MessageService;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
    private final MessageMapper messageMapper;

    public MessageServiceImpl(MessageMapper messageMapper) {
        this.messageMapper = messageMapper;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return messageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Message row) {
        return messageMapper.insert(row);
    }

    @Override
    public int insertSelective(Message row) {
        return messageMapper.insertSelective(row);
    }

    @Override
    public Message selectByPrimaryKey(String id) {
        return messageMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Message row) {
        return messageMapper.updateByPrimaryKeySelective(row);
    }

    @Override
    public int updateByPrimaryKey(Message row) {
        return messageMapper.updateByPrimaryKey(row);
    }
}
/**
 * @mbg.generated generator on Sat Sep 17 13:24:27 CST 2022
 */
package com.lenjoy.modules.forum.service.impl;

import com.lenjoy.modules.forum.entity.Topic;
import com.lenjoy.modules.forum.mapper.TopicMapper;
import com.lenjoy.modules.forum.service.TopicService;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl implements TopicService {
    private final TopicMapper topicMapper;

    public TopicServiceImpl(TopicMapper topicMapper) {
        this.topicMapper = topicMapper;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return topicMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Topic row) {
        return topicMapper.insert(row);
    }

    @Override
    public int insertSelective(Topic row) {
        return topicMapper.insertSelective(row);
    }

    @Override
    public Topic selectByPrimaryKey(String id) {
        return topicMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Topic row) {
        return topicMapper.updateByPrimaryKeySelective(row);
    }

    @Override
    public int updateByPrimaryKey(Topic row) {
        return topicMapper.updateByPrimaryKey(row);
    }
}
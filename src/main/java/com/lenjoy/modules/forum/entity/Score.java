package com.lenjoy.modules.forum.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Score {
    private String id;

    private String userId;

    private String sourceType;

    private String sourceId;

    /**
     * 操作类型, 0: 减少， 1: 增加
     */
    private Integer type;

    private Integer score;

    private String description;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 更新时间
     */
    private Date updateAt;
}
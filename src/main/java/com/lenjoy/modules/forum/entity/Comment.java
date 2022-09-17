package com.lenjoy.modules.forum.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Comment {
    private String id;

    private String content;

    private Integer likeCount;

    private Integer commentCount;

    private String userAgent;

    private String ip;

    private Object status;

    /**
     * 评论用户id
     */
    private String userId;

    /**
     * 评论主体,比如帖子
     */
    private String entityId;

    /**
     * 引用的评论id
     */
    private String quoteId;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 更新时间
     */
    private Date updateAt;
}
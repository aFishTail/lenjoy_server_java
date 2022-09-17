package com.lenjoy.modules.forum.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Topic {
    private String id;

    private Integer recommand;

    private Integer viewCount;

    /**
     * 评论数量
     */
    private Integer commentCount;

    /**
     * 点赞数量
     */
    private Integer likeCount;

    /**
     * 收藏数量
     */
    private Integer favoriteCount;

    private Date lastCommentTime;

    private String lastCommentUser;

    private String userAgent;

    private String ip;

    private String userId;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 更新时间
     */
    private Date updateAt;

    private String categoryid;

    private String summary;

    private String title;

    private String content;
}
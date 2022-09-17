package com.lenjoy.modules.forum.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String id;

    private String username;

    private String password;

    private String nickname;

    private String avatar;

    private String email;

    private Byte emialVerified;

    private String description;

    private Integer score;

    private Integer topicCount;

    private Integer commentCount;

    private Integer fansCount;

    private Integer followCount;

    private Object role;

    private Object status;

    /**
     * 禁言时间
     */
    private Date forbiddenEndTime;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 更新时间
     */
    private Date updateAt;
}
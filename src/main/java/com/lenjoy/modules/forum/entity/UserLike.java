package com.lenjoy.modules.forum.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserLike {
    private String id;

    private String userId;

    private String entityType;

    private String entityId;

    private Integer status;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 更新时间
     */
    private Date updateAt;
}
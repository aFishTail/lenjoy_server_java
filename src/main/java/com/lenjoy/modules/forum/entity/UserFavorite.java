package com.lenjoy.modules.forum.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserFavorite {
    private String id;

    private String userid;

    private String entitytype;

    private String entityid;

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
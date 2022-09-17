package com.lenjoy.modules.forum.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Follow {
    private String id;

    private String userId;

    private String otherId;

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
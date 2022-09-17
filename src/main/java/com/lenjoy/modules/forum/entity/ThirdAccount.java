package com.lenjoy.modules.forum.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ThirdAccount {
    private String id;

    private String avatar;

    private String nickname;

    private Object thirdType;

    private String thirdId;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 更新时间
     */
    private Date updateAt;

    private String userid;
}
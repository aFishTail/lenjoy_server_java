package com.lenjoy.modules.forum.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Message {
    private String id;

    /**
     * 消息发送人
     */
    private String fromUserId;

    /**
     * 消息接收人
     */
    private String userId;

    /**
     * 消息标题
     */
    private String title;

    /**
     * 消息内容
     */
    private String content;

    /**
     * 引用内容
     */
    private String quotecontent;

    /**
     * 消息类型
     */
    private Integer type;

    /**
     * 0:未读， 1:已读
     */
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
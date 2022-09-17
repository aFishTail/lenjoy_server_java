package com.lenjoy.modules.forum.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 表名：category
 */
@Data
@TableName(value = "category")
public class Category {
    @TableId(value = "id", type = IdType.AUTO)
    @TableField(value = "id")
    private String id;

    /**
     * 图标
     */
    @TableField(value = "logo")
    private String logo;

    /**
     * 排序
     */
    @TableField(value = "sortNo")
    private Integer sortno;

    /**
     * 状态, 1: 正常，0: 停止使用
     */
    @TableField(value = "`status`")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "create_at")
    private Date createAt;

    /**
     * 更新时间
     */
    @TableField(value = "update_at")
    private Date updateAt;

    @TableField(value = "`label`")
    private String label;

    @TableField(value = "description")
    private String description;

    @TableField(value = "`name`")
    private String name;
}
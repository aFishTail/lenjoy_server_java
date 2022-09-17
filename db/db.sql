-- 菜单
CREATE TABLE `sys_menu`
(
    `menu_id`   bigint NOT NULL AUTO_INCREMENT,
    `parent_id` bigint COMMENT '父菜单ID，一级菜单为0',
    `name`      varchar(50) COMMENT '菜单名称',
    `url`       varchar(200) COMMENT '菜单URL',
    `perms`     varchar(500) COMMENT '授权(多个用逗号分隔，如：user:list,user:create)',
    `type`      int COMMENT '类型   0：目录   1：菜单   2：按钮',
    `icon`      varchar(50) COMMENT '菜单图标',
    `order_num` int COMMENT '排序',
    PRIMARY KEY (`menu_id`)
) ENGINE = `InnoDB`
  DEFAULT CHARACTER SET utf8mb4 COMMENT ='菜单管理';

-- 系统用户
CREATE TABLE `sys_user`
(
    `id`               bigint                                                 NOT NULL AUTO_INCREMENT,
    `username`         varchar(50)                                            NOT NULL COMMENT '用户名',
    `password`         varchar(100) COMMENT '密码',
    `salt`             varchar(20) COMMENT '盐',
    `email`            varchar(100) COMMENT '邮箱',
    `mobile`           varchar(100) COMMENT '手机号',
    `status`           tinyint COMMENT '状态  0：禁用   1：正常',
    `create_user_id`   bigint(20) COMMENT '创建者ID',
    `create_time`      datetime COMMENT '创建时间',
    nickname           varchar(500)                                           null,
    avatar             varchar(500)                                           null,
    emial_verified     tinyint                   default 0                    not null,
    description        varchar(500)                                           null,
    score              int                       default 0                    not null,
    topic_count        int                       default 0                    not null,
    comment_count      int                       default 0                    not null,
    fans_count         int                       default 0                    not null,
    follow_count       int                       default 0                    not null,
    role               enum ('admin', 'visitor') default 'visitor'            not null,
    forbidden_end_time datetime                                               null comment '禁言时间',
    create_at          datetime(6)               default CURRENT_TIMESTAMP(6) not null comment '创建时间',
    update_at          datetime(6)               default CURRENT_TIMESTAMP(6) not null on update CURRENT_TIMESTAMP(6) comment '更新时间',
    constraint IDX_e12875dfb3b1d92d7d7c5377e2
        unique (email),
    PRIMARY KEY (`id`),
    UNIQUE INDEX (`username`)
) ENGINE = `InnoDB`
  DEFAULT CHARACTER SET utf8mb4 COMMENT ='系统用户';


-- 系统用户Token
CREATE TABLE `sys_user_token`
(
    `user_id`     bigint(20)   NOT NULL,
    `token`       varchar(100) NOT NULL COMMENT 'token',
    `expire_time` datetime DEFAULT NULL COMMENT '过期时间',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`user_id`),
    UNIQUE KEY `token` (`token`)
) ENGINE = `InnoDB`
  DEFAULT CHARACTER SET utf8mb4 COMMENT ='系统用户Token';

-- 系统验证码
CREATE TABLE `sys_captcha`
(
    `uuid`        char(36)   NOT NULL COMMENT 'uuid',
    `code`        varchar(6) NOT NULL COMMENT '验证码',
    `expire_time` datetime DEFAULT NULL COMMENT '过期时间',
    PRIMARY KEY (`uuid`)
) ENGINE = `InnoDB`
  DEFAULT CHARACTER SET utf8mb4 COMMENT ='系统验证码';

-- 角色
CREATE TABLE `sys_role`
(
    `role_id`        bigint NOT NULL AUTO_INCREMENT,
    `role_name`      varchar(100) COMMENT '角色名称',
    `remark`         varchar(100) COMMENT '备注',
    `create_user_id` bigint(20) COMMENT '创建者ID',
    `create_time`    datetime COMMENT '创建时间',
    PRIMARY KEY (`role_id`)
) ENGINE = `InnoDB`
  DEFAULT CHARACTER SET utf8mb4 COMMENT ='角色';

-- 用户与角色对应关系
CREATE TABLE `sys_user_role`
(
    `id`      bigint NOT NULL AUTO_INCREMENT,
    `user_id` bigint COMMENT '用户ID',
    `role_id` bigint COMMENT '角色ID',
    PRIMARY KEY (`id`)
) ENGINE = `InnoDB`
  DEFAULT CHARACTER SET utf8mb4 COMMENT ='用户与角色对应关系';

-- 角色与菜单对应关系
CREATE TABLE `sys_role_menu`
(
    `id`      bigint NOT NULL AUTO_INCREMENT,
    `role_id` bigint COMMENT '角色ID',
    `menu_id` bigint COMMENT '菜单ID',
    PRIMARY KEY (`id`)
) ENGINE = `InnoDB`
  DEFAULT CHARACTER SET utf8mb4 COMMENT ='角色与菜单对应关系';

-- 系统配置信息
CREATE TABLE `sys_config`
(
    `id`          bigint NOT NULL AUTO_INCREMENT,
    `param_key`   varchar(50) COMMENT 'key',
    `param_value` varchar(2000) COMMENT 'value',
    `status`      tinyint DEFAULT 1 COMMENT '状态   0：隐藏   1：显示',
    `remark`      varchar(500) COMMENT '备注',
    PRIMARY KEY (`id`),
    UNIQUE INDEX (`param_key`)
) ENGINE = `InnoDB`
  DEFAULT CHARACTER SET utf8mb4 COMMENT ='系统配置信息表';


-- 系统日志
CREATE TABLE `sys_log`
(
    `id`          bigint(20) NOT NULL AUTO_INCREMENT,
    `username`    varchar(50) COMMENT '用户名',
    `operation`   varchar(50) COMMENT '用户操作',
    `method`      varchar(200) COMMENT '请求方法',
    `params`      varchar(5000) COMMENT '请求参数',
    `time`        bigint     NOT NULL COMMENT '执行时长(毫秒)',
    `ip`          varchar(64) COMMENT 'IP地址',
    `create_date` datetime COMMENT '创建时间',
    PRIMARY KEY (`id`)
) ENGINE = `InnoDB`
  DEFAULT CHARACTER SET utf8mb4 COMMENT ='系统日志';

-- 用户表
CREATE TABLE `tb_user`
(
    `user_id`     bigint      NOT NULL AUTO_INCREMENT,
    `username`    varchar(50) NOT NULL COMMENT '用户名',
    `mobile`      varchar(20) NOT NULL COMMENT '手机号',
    `password`    varchar(64) COMMENT '密码',
    `create_time` datetime COMMENT '创建时间',
    PRIMARY KEY (`user_id`),
    UNIQUE INDEX (`username`)
) ENGINE = `InnoDB`
  DEFAULT CHARACTER SET utf8mb4 COMMENT ='用户';


-- 初始数据
INSERT INTO `sys_user` (`id`, `username`, `password`, `salt`, `email`, `mobile`, `status`, `create_user_id`,
                        `create_time`)
VALUES ('1', 'admin', '9ec9750e709431dad22365cabc5c625482e574c74adaebba7dd02f1129e4ce1d', 'YzcmCZNvbXocrsz9dm8e',
        'root@renren.io', '13612345678', '1', '1', '2016-11-11 11:11:11');

INSERT INTO `sys_menu`(`menu_id`, `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
VALUES (1, 0, '系统管理', NULL, NULL, 0, 'system', 0);
INSERT INTO `sys_menu`(`menu_id`, `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
VALUES (2, 1, '管理员列表', 'sys/user', NULL, 1, 'admin', 1);
INSERT INTO `sys_menu`(`menu_id`, `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
VALUES (3, 1, '角色管理', 'sys/role', NULL, 1, 'role', 2);
INSERT INTO `sys_menu`(`menu_id`, `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
VALUES (4, 1, '菜单管理', 'sys/menu', NULL, 1, 'menu', 3);
INSERT INTO `sys_menu`(`menu_id`, `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
VALUES (15, 2, '查看', NULL, 'sys:user:list,sys:user:info', 2, NULL, 0);
INSERT INTO `sys_menu`(`menu_id`, `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
VALUES (16, 2, '新增', NULL, 'sys:user:save,sys:role:select', 2, NULL, 0);
INSERT INTO `sys_menu`(`menu_id`, `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
VALUES (17, 2, '修改', NULL, 'sys:user:update,sys:role:select', 2, NULL, 0);
INSERT INTO `sys_menu`(`menu_id`, `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
VALUES (18, 2, '删除', NULL, 'sys:user:delete', 2, NULL, 0);
INSERT INTO `sys_menu`(`menu_id`, `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
VALUES (19, 3, '查看', NULL, 'sys:role:list,sys:role:info', 2, NULL, 0);
INSERT INTO `sys_menu`(`menu_id`, `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
VALUES (20, 3, '新增', NULL, 'sys:role:save,sys:menu:list', 2, NULL, 0);
INSERT INTO `sys_menu`(`menu_id`, `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
VALUES (21, 3, '修改', NULL, 'sys:role:update,sys:menu:list', 2, NULL, 0);
INSERT INTO `sys_menu`(`menu_id`, `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
VALUES (22, 3, '删除', NULL, 'sys:role:delete', 2, NULL, 0);
INSERT INTO `sys_menu`(`menu_id`, `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
VALUES (23, 4, '查看', NULL, 'sys:menu:list,sys:menu:info', 2, NULL, 0);
INSERT INTO `sys_menu`(`menu_id`, `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
VALUES (24, 4, '新增', NULL, 'sys:menu:save,sys:menu:select', 2, NULL, 0);
INSERT INTO `sys_menu`(`menu_id`, `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
VALUES (25, 4, '修改', NULL, 'sys:menu:update,sys:menu:select', 2, NULL, 0);
INSERT INTO `sys_menu`(`menu_id`, `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
VALUES (26, 4, '删除', NULL, 'sys:menu:delete', 2, NULL, 0);
INSERT INTO `sys_menu`(`menu_id`, `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
VALUES (27, 1, '参数管理', 'sys/config',
        'sys:config:list,sys:config:info,sys:config:save,sys:config:update,sys:config:delete', 1, 'config', 6);
INSERT INTO `sys_menu`(`menu_id`, `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
VALUES (29, 1, '系统日志', 'sys/log', 'sys:log:list', 1, 'log', 7);


-- 账号：13612345678  密码：admin
INSERT INTO `tb_user` (`username`, `mobile`, `password`, `create_time`)
VALUES ('mark', '13612345678', '8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918',
        '2017-03-23 22:37:41');

create table if not exists category
(
    id          varchar(36)                              not null
        primary key,
    logo        varchar(500)                             null comment '图标',
    sortNo      int         default 0                    not null comment '排序',
    status      int         default 1                    not null comment '状态, 1: 正常，0: 停止使用',
    create_at   datetime(6) default CURRENT_TIMESTAMP(6) not null comment '创建时间',
    update_at   datetime(6) default CURRENT_TIMESTAMP(6) not null on update CURRENT_TIMESTAMP(6) comment '更新时间',
    label       varchar(10)                              not null,
    description varchar(200)                             null,
    name        varchar(10)                              not null,
    constraint IDX_23c05c292c439d77b0de816b50
        unique (name)
);

create table if not exists comment
(
    id            varchar(36)                                            not null
        primary key,
    content       varchar(255)                                           not null,
    like_count    int                       default 0                    not null,
    comment_count int                       default 0                    not null,
    user_agent    varchar(500)                                           not null,
    ip            varchar(500)                                           not null,
    status        enum ('locked', 'active') default 'active'             not null,
    user_id       varchar(255)                                           not null comment '评论用户id',
    entity_id     varchar(255)                                           not null comment '评论主体,比如帖子',
    quote_id      varchar(255)                                           null comment '引用的评论id',
    create_at     datetime(6)               default CURRENT_TIMESTAMP(6) not null comment '创建时间',
    update_at     datetime(6)               default CURRENT_TIMESTAMP(6) not null on update CURRENT_TIMESTAMP(6) comment '更新时间'
);

create table if not exists email_code
(
    id        varchar(36)                              not null
        primary key,
    user_id   varchar(255)                             not null,
    email     varchar(255)                             not null,
    used      tinyint     default 0                    not null,
    create_at datetime(6) default CURRENT_TIMESTAMP(6) not null comment '创建时间',
    update_at datetime(6) default CURRENT_TIMESTAMP(6) not null on update CURRENT_TIMESTAMP(6) comment '更新时间'
);

create table if not exists follow
(
    id        varchar(36)                              not null
        primary key,
    user_id   varchar(255)                             not null,
    other_id  varchar(255)                             not null,
    status    int                                      not null,
    create_at datetime(6) default CURRENT_TIMESTAMP(6) not null comment '创建时间',
    update_at datetime(6) default CURRENT_TIMESTAMP(6) not null on update CURRENT_TIMESTAMP(6) comment '更新时间'
);

create table if not exists message
(
    id           varchar(36)                              not null
        primary key,
    from_user_id varchar(255)                             not null comment '消息发送人',
    user_id      varchar(255)                             not null comment '消息接收人',
    title        varchar(50)                              not null comment '消息标题',
    content      varchar(100)                             not null comment '消息内容',
    quoteContent varchar(100)                             not null comment '引用内容',
    type         int                                      not null comment '消息类型',
    status       int                                      not null comment '0:未读， 1:已读',
    create_at    datetime(6) default CURRENT_TIMESTAMP(6) not null comment '创建时间',
    update_at    datetime(6) default CURRENT_TIMESTAMP(6) not null on update CURRENT_TIMESTAMP(6) comment '更新时间'
);

create table if not exists score
(
    id          varchar(36)                              not null
        primary key,
    user_id     varchar(255)                             not null,
    source_type varchar(255)                             not null,
    source_id   varchar(255)                             not null,
    type        int                                      not null comment '操作类型, 0: 减少， 1: 增加',
    score       int                                      not null,
    description varchar(255)                             not null,
    create_at   datetime(6) default CURRENT_TIMESTAMP(6) not null comment '创建时间',
    update_at   datetime(6) default CURRENT_TIMESTAMP(6) not null on update CURRENT_TIMESTAMP(6) comment '更新时间'
);

create table if not exists topic
(
    id                varchar(36)                              not null
        primary key,
    recommand         int         default 0                    not null,
    view_count        int         default 0                    not null,
    comment_count     int         default 0                    not null comment '评论数量',
    like_count        int         default 0                    not null comment '点赞数量',
    favorite_count    int         default 0                    not null comment '收藏数量',
    last_comment_time datetime                                 null,
    last_comment_user varchar(255)                             null,
    user_agent        varchar(500)                             null,
    ip                varchar(500)                             null,
    user_id           varchar(255)                             not null,
    create_at         datetime(6) default CURRENT_TIMESTAMP(6) not null comment '创建时间',
    update_at         datetime(6) default CURRENT_TIMESTAMP(6) not null on update CURRENT_TIMESTAMP(6) comment '更新时间',
    categoryId        varchar(36)                              null,
    summary           varchar(255)                             not null,
    title             varchar(50)                              not null,
    content           text                                     not null,
    constraint FK_f8bf220112570b5c2be647f0942
        foreign key (categoryId) references category (id)
);

create table if not exists third_account
(
    id         varchar(36)                                                  not null
        primary key,
    Avatar     varchar(255)                                                 not null,
    nickname   varchar(255)                                                 not null,
    third_type enum ('github', 'qq', 'weixin') default 'github'             not null,
    third_id   varchar(255)                                                 not null,
    create_at  datetime(6)                     default CURRENT_TIMESTAMP(6) not null comment '创建时间',
    update_at  datetime(6)                     default CURRENT_TIMESTAMP(6) not null on update CURRENT_TIMESTAMP(6) comment '更新时间',
    userId     varchar(36)                                                  null
);

create table if not exists user_favorite
(
    id         varchar(36)                              not null
        primary key,
    userId     varchar(255)                             not null,
    entityType varchar(255)                             not null,
    entityId   varchar(255)                             not null,
    status     int                                      not null,
    create_at  datetime(6) default CURRENT_TIMESTAMP(6) not null comment '创建时间',
    update_at  datetime(6) default CURRENT_TIMESTAMP(6) not null on update CURRENT_TIMESTAMP(6) comment '更新时间'
);

create table if not exists user_like
(
    id          varchar(36)                              not null
        primary key,
    user_id     varchar(255)                             not null,
    entity_type varchar(255)                             not null,
    entity_id   varchar(255)                             not null,
    status      int                                      not null,
    create_at   datetime(6) default CURRENT_TIMESTAMP(6) not null comment '创建时间',
    update_at   datetime(6) default CURRENT_TIMESTAMP(6) not null on update CURRENT_TIMESTAMP(6) comment '更新时间'
);


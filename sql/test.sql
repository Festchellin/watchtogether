create table tb_table
(
  id            int auto_increment
    primary key,
  tb_name       varchar(255) null,
  tb_comment    varchar(512) null,
  navigate_link varchar(255) null comment 'front end link for client to navigation',
  type          int(1)       null comment 'user menu(1) admin menu(2)'
);

INSERT INTO test.tb_table (id, tb_name, tb_comment, navigate_link, type)
VALUES (2, 'tb_table', 'Tables Management', '/admin/table', 2);
INSERT INTO test.tb_table (id, tb_name, tb_comment, navigate_link, type)
VALUES (3, 'tb_user', 'User Management', '/admin/user-admin', 2);
INSERT INTO test.tb_table (id, tb_name, tb_comment, navigate_link, type)
VALUES (4, 'tb_user_info', 'User Info Management', '/admin/userInfo', 2);
INSERT INTO test.tb_table (id, tb_name, tb_comment, navigate_link, type)
VALUES (5, 'tb_user_log', 'User Log Management', '/admin/userLog', 2);
INSERT INTO test.tb_table (id, tb_name, tb_comment, navigate_link, type)
VALUES (17, 'tb_user', 'Modify Password', '/user/modify/password', 1);
INSERT INTO test.tb_table (id, tb_name, tb_comment, navigate_link, type)
VALUES (18, 'tb_user_info', 'User Profile', '/user/modify/user', 1);
INSERT INTO test.tb_table (id, tb_name, tb_comment, navigate_link, type)
VALUES (19, 'tb_video', 'My Video', '/user/video', 1);
create table tb_user
(
  id         bigint auto_increment comment '用户id'
    primary key,
  name       varchar(32)      not null comment '昵称',
  account    varchar(32)      not null comment '账号',
  password   varchar(32)      not null comment '密码',
  admin_role int(1) default 0 null,
  constraint tb_user_account_uindex
    unique (account)
)
  comment 'user表';

INSERT INTO test.tb_user (id, name, account, password, admin_role)
VALUES (11, 'Admin', '123456789', 'e10adc3949ba59abbe56e057f20f883e', 1);
create table tb_user_info
(
  id               int auto_increment
    primary key,
  u_id             int         not null,
  register_date    timestamp   null,
  last_modify_time timestamp   null,
  email            varchar(50) null,
  phone_number     varchar(14) null,
  avatar           tinytext    null
);

create table tb_user_log
(
  id         bigint auto_increment
    primary key,
  user_id    bigint       not null,
  login_time datetime     not null,
  user_token varchar(255) not null
);

create table tb_video
(
  id           bigint auto_increment
    primary key,
  name         varchar(32)  null comment '影片名称',
  description  text         null comment '影片简介',
  url          varchar(255) null comment '影片地址',
  release_time datetime     null comment '上映时间',
  author_id    int          null comment '作者',
  poster       varchar(255) null comment '视频略缩图'
);

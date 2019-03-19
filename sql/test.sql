create table tb_table
(
  id            int auto_increment
    primary key,
  tb_name       varchar(255) null,
  tb_comment    varchar(512) null,
  navigate_link varchar(255) null comment 'front end link for client to navigation',
  type          int(1)       null comment 'user menu(1) admin menu(2)'
);

INSERT INTO test.tb_table (id, tb_name, tb_comment, navigate_link, type) VALUES (2, 'tb_table', 'Tables Management', '/admin/table', 2);
INSERT INTO test.tb_table (id, tb_name, tb_comment, navigate_link, type) VALUES (3, 'tb_user', 'User Management', '/admin/user-admin', 2);
INSERT INTO test.tb_table (id, tb_name, tb_comment, navigate_link, type) VALUES (4, 'tb_user_info', 'User Info Management', '/admin/userInfo', 2);
INSERT INTO test.tb_table (id, tb_name, tb_comment, navigate_link, type) VALUES (5, 'tb_user_log', 'User Log Management', '/admin/userLog', 2);
INSERT INTO test.tb_table (id, tb_name, tb_comment, navigate_link, type) VALUES (17, 'tb_user', 'Modify Password', '/user/modify/password', 1);
INSERT INTO test.tb_table (id, tb_name, tb_comment, navigate_link, type) VALUES (18, 'tb_user_info', 'User Profile', '/user/modify/user', 1);
INSERT INTO test.tb_table (id, tb_name, tb_comment, navigate_link, type) VALUES (19, 'tb_video', 'My Video', '/user/video', 1);
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

INSERT INTO test.tb_user (id, name, account, password, admin_role) VALUES (11, 'Admin', '123456789', 'e10adc3949ba59abbe56e057f20f883e', 1);
INSERT INTO test.tb_user (id, name, account, password, admin_role) VALUES (12, 'festchellin', 'fest', 'e10adc3949ba59abbe56e057f20f883e', 0);
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

INSERT INTO test.tb_user_info (id, u_id, register_date, last_modify_time, email, phone_number, avatar) VALUES (1, 12, '2019-03-19 12:33:21', '2019-03-19 12:33:21', null, null, null);
create table tb_user_log
(
  id         bigint auto_increment
    primary key,
  user_id    bigint       not null,
  login_time datetime     not null,
  user_token varchar(255) not null
);

INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (1, 11, '2019-03-19 12:32:39', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MzU3NDc1OCwiaWF0IjoxNTUyOTY5OTU4LCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.sWm3jx-WoZ8c_KrRK05r3OdSZf8J2tv-T_zi4i-40fA');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (2, 12, '2019-03-19 12:33:21', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTM1NzQ4MDEsImlhdCI6MTU1Mjk3MDAwMSwiYWNjb3VudCI6ImZlc3QifQ.fVt4NhX-erQmKOu-ufd8AnVcpxLBIQ2lnI9vkN0jHgQ');
create table tb_video
(
  id           bigint auto_increment
    primary key,
  name         varchar(255) null comment '影片名称',
  description  text         null comment '影片简介',
  url          varchar(255) null comment '影片地址',
  release_time datetime     null comment '上映时间',
  author_id    int          null comment '作者',
  poster       varchar(255) null comment '视频略缩图'
);

INSERT INTO test.tb_video (id, name, description, url, release_time, author_id, poster) VALUES (6, 'Highlights from Flutter at Mobile World Congress 2019.', 'Flutter在2019年世界移动通信大会上的亮点', '/upload/videos/20190319/Highlights from Flutter at Mobile World Congress 2019.mp4', '2019-03-19 13:02:28', 12, '');
INSERT INTO test.tb_video (id, name, description, url, release_time, author_id, poster) VALUES (7, '你比我贵，但是不代表我完败（下） 三星S10 【值不值得买第319期', '你比我贵，但是不代表我完败（下） 三星S10 【值不值得买第319期', '/upload/videos/20190319/你比我贵，但是不代表我完败（下） 三星S10 【值不值得买第319期】.mp4', '2019-03-19 13:04:55', 12, '');
INSERT INTO test.tb_video (id, name, description, url, release_time, author_id, poster) VALUES (8, 'Ionic 4_ Should you Build a Hybrid App', 'Ionic 4_ Should you Build a Hybrid App', '/upload/videos/20190319/Ionic 4_ Should you Build a Hybrid App.mp4', '2019-03-19 13:05:27', 12, '');
create table tb_category
(
	id int auto_increment
		primary key,
	name varchar(255) null comment '视频名称
',
	last_modify_time datetime null comment '最后修改时间',
	constraint tb_category_name_uindex
		unique (name)
)
comment '视频分类表';

INSERT INTO test.tb_category (id, name, last_modify_time)
VALUES (1, 'action videos', '2019-02-18 06:40:39');
INSERT INTO test.tb_category (id, name, last_modify_time) VALUES (2, 'comedy', '2019-02-20 06:54:50');
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

INSERT INTO test.tb_user (id, name, account, password, admin_role) VALUES (11, 'asdas', '123456789', 'e10adc3949ba59abbe56e057f20f883e', 1);
INSERT INTO test.tb_user (id, name, account, password, admin_role) VALUES (14, 'festchellin@gmail.com', 'festchellin@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 0);
INSERT INTO test.tb_user (id, name, account, password, admin_role) VALUES (20, '', 'fest', 'e10adc3949ba59abbe56e057f20f883e', 0);
INSERT INTO test.tb_user (id, name, account, password, admin_role) VALUES (21, 'aaaa', 'aaaa', 'e10adc3949ba59abbe56e057f20f883e', 0);
INSERT INTO test.tb_user (id, name, account, password, admin_role) VALUES (22, 'aaa', 'aaaa1', 'e10adc3949ba59abbe56e057f20f883e', 0);
INSERT INTO test.tb_user (id, name, account, password, admin_role) VALUES (23, '11111', '11111', '96e79218965eb72c92a549dd5a330112', 0);
create table tb_user_info
(
  id               bigint auto_increment
    primary key,
  u_id             bigint      not null,
  register_date    date        not null,
  last_modify_time date        not null,
  email            varchar(50) not null,
  phone_number     varchar(14) not null,
  avatar           tinytext    not null
);


create table tb_user_log
(
  id         bigint auto_increment
    primary key,
  user_id    bigint       not null,
  login_time datetime     not null,
  user_token varchar(255) not null
);

INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (6, 11, '2019-01-01 16:14:47', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDY5MzUyNzQsImlhdCI6MTU0NjMzMDQ3NCwiYWNjb3VudCI6IjEyMzQ1Njc4OSJ9.RisvB_IsgFWpoD5-215IR26JkIMC9ui6tjUYhWz_vFY');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (7, 11, '2019-01-02 11:00:24', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDcwMDI4MjMsImlhdCI6MTU0NjM5ODAyMywiYWNjb3VudCI6IjEyMzQ1Njc4OSJ9.6Mmw7LRSqWv2vw12ZwRvUJC2cOYV8GMYpl50JJsJR-Y');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (9, 11, '2019-01-02 11:01:18', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDcwMDI4NzgsImlhdCI6MTU0NjM5ODA3OCwiYWNjb3VudCI6IjEyMzQ1Njc4OSJ9.XhcSSLZkWU5hhMvIdTy8ZefzSD2LAOGgSKFH4YMXcBA');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (10, 11, '2019-01-29 09:33:34', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzMzA0MTQsImlhdCI6MTU0ODcyNTYxNCwiYWNjb3VudCI6IjEyMzQ1Njc4OSJ9.-tH-cDpvE79TvlLjlPsNs6gf8iIOA9sqLk8Hqdl3MuM');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (11, 11, '2019-01-29 09:36:04', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzMzA1NjMsImlhdCI6MTU0ODcyNTc2MywiYWNjb3VudCI6IjEyMzQ1Njc4OSJ9.mBKa8HYaWnUsSIgNtBqtidNHDvpIDQ1b7Rn-KbsscQE');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (12, 14, '2019-01-29 09:56:21', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzMzE3ODAsImlhdCI6MTU0ODcyNjk4MCwiYWNjb3VudCI6ImZlc3QifQ.PumtpgY7Urw0LQ_pjgYzzCfKpOUqwIO1vEDm-chMh7s');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (13, 14, '2019-01-29 09:57:01', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzMzE4MjEsImlhdCI6MTU0ODcyNzAyMSwiYWNjb3VudCI6ImZlc3QifQ.zO80ZqOndY4ZipZDPbJaN6Nz5ToMmTkS31IYlqQrqJs');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (14, 14, '2019-01-29 09:58:18', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzMzE4OTgsImlhdCI6MTU0ODcyNzA5OCwiYWNjb3VudCI6ImZlc3QifQ.y3XsFmhv_OV2SK0frVotSLeEY0_eBfeaUeLBv9jypn8');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (15, 14, '2019-01-29 10:28:58', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzMzM3MzcsImlhdCI6MTU0ODcyODkzNywiYWNjb3VudCI6ImZlc3QifQ.HLzDToWD_DWv1BiJzBZvVJeslHdFvzsRdrcl-dXmkBo');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (16, 14, '2019-01-29 10:31:13', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzMzM4NzIsImlhdCI6MTU0ODcyOTA3MiwiYWNjb3VudCI6ImZlc3QifQ.Pqx-kPFzS5N4K5Xv_878diyFcv22qU3yXu9cXoaE9D0');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (17, 14, '2019-01-29 10:33:30', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzMzQwMTAsImlhdCI6MTU0ODcyOTIxMCwiYWNjb3VudCI6ImZlc3QifQ.pW2MBcm3fkQ9sQAQBoNZV_JKJ7vEAIt3jOjshwnJNi0');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (18, 14, '2019-01-29 10:39:55', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzMzQzOTQsImlhdCI6MTU0ODcyOTU5NCwiYWNjb3VudCI6ImZlc3QifQ.L2g1weaV8s00XRMyg_D_bKAcMfv1jxhb1nQ01IV40_M');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (19, 14, '2019-01-29 10:46:01', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzMzQ3NjEsImlhdCI6MTU0ODcyOTk2MSwiYWNjb3VudCI6ImZlc3QifQ.0NHRaLxU2XuNx0RDZ-JWg7HmjtS5xOQrlRjMMx6hMuE');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (20, 14, '2019-01-29 10:48:38', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzMzQ5MTcsImlhdCI6MTU0ODczMDExNywiYWNjb3VudCI6ImZlc3QifQ.5B_aTF9z95s4XnhcoFOYo5g7bq14meTZzKzzawuGEqU');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (21, 14, '2019-01-29 10:49:16', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzMzQ5NTUsImlhdCI6MTU0ODczMDE1NSwiYWNjb3VudCI6ImZlc3QifQ.YNmQ1W6fGkFR1SxlBWL7ZeGxrBaBFjwg2vEKttCZk4c');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (22, 14, '2019-01-29 10:49:52', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzMzQ5OTEsImlhdCI6MTU0ODczMDE5MSwiYWNjb3VudCI6ImZlc3QifQ.r-cVDn4PidUjafS-jScxqbMCrYLbDvgxVJy31iTUaWk');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (23, 14, '2019-01-29 11:02:46', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzMzU3NjYsImlhdCI6MTU0ODczMDk2NiwiYWNjb3VudCI6ImZlc3QifQ.DXpbposTzJenHg-tWhg5t_jrE2uV3K3WoF2rkIVe7g8');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (24, 14, '2019-01-29 11:03:04', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzMzU3ODMsImlhdCI6MTU0ODczMDk4MywiYWNjb3VudCI6ImZlc3QifQ.uNhhEHeVvRXjNH9-UKDXGwLetyQD3m-GSbT_Nqxk_cc');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (25, 15, '2019-01-29 11:07:46', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzMzYwNjUsImlhdCI6MTU0ODczMTI2NSwiYWNjb3VudCI6InRlc3QifQ.6bbg_u7ww2_rxFHq4dI1aUmgXBuD--gdnxZF1ngQsk8');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (26, 17, '2019-01-29 11:09:14', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzMzYxNTMsImlhdCI6MTU0ODczMTM1MywiYWNjb3VudCI6InRlc3QifQ.pNVJRew_rqfn3UtldeOMVLUPU63WXAUCUTdNTzYZ1UE');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (27, 14, '2019-01-29 12:16:29', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNDAxODksImlhdCI6MTU0ODczNTM4OSwiYWNjb3VudCI6ImZlc3QifQ.gOq_oRPtYNKciNH2FywC191GVRbfiCb57PQ81NenANE');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (28, 14, '2019-01-29 12:18:07', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNDAyODcsImlhdCI6MTU0ODczNTQ4NywiYWNjb3VudCI6ImZlc3QifQ.93E--I5Gdp5YxDdg-_vaSXHCSV7PO8uQNPklTklPO80');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (29, 14, '2019-01-29 12:18:15', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNDAyOTQsImlhdCI6MTU0ODczNTQ5NCwiYWNjb3VudCI6ImZlc3QifQ.wGX3zN9dW0UXULg1354YBft64uuoBuQjk_2tJHcWW-w');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (30, 14, '2019-01-29 14:34:30', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNDg0NjksImlhdCI6MTU0ODc0MzY2OSwiYWNjb3VudCI6ImZlc3QifQ.JOvMQ6O3I3-4ul2oenHAY44KmTHVqaDb6bhboODpeKQ');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (31, 14, '2019-01-29 14:40:58', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNDg4NTcsImlhdCI6MTU0ODc0NDA1NywiYWNjb3VudCI6ImZlc3QifQ.0lSzYLZnBOagkCAUirbuZa1pqzN04lTfqLKy1IM8G8M');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (32, 14, '2019-01-29 14:59:08', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNDk5NDcsImlhdCI6MTU0ODc0NTE0NywiYWNjb3VudCI6ImZlc3QifQ.MCctWdGTM5u2klhGJGRnJvupId8BESA4-sX01CI7Dbc');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (33, 14, '2019-01-29 15:02:41', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTAxNjAsImlhdCI6MTU0ODc0NTM2MCwiYWNjb3VudCI6ImZlc3QifQ.FIViZeCCvPwK0KK2lyhbmZrtTziLk88IosYMGso1gM8');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (34, 14, '2019-01-29 15:09:36', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTA1NzUsImlhdCI6MTU0ODc0NTc3NSwiYWNjb3VudCI6ImZlc3QifQ.fTclu7jjcmi_WgJcZvWoOtMuzWWT__ZE5wz1Pl48XSE');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (35, 14, '2019-01-29 15:10:47', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTA2NDcsImlhdCI6MTU0ODc0NTg0NywiYWNjb3VudCI6ImZlc3QifQ.ysKuz4iofu2XHhKOc8cUKTXD5PIpsm1ORXBRfYP1_rQ');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (36, 14, '2019-01-29 15:11:59', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTA3MTksImlhdCI6MTU0ODc0NTkxOSwiYWNjb3VudCI6ImZlc3QifQ.fbXb37-J1-Fna9B7CO-MJBqzajb9kq93Ftd7LXCtgTo');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (37, 14, '2019-01-29 15:12:15', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTA3MzQsImlhdCI6MTU0ODc0NTkzNCwiYWNjb3VudCI6ImZlc3QifQ.5dwSTolBAzxcaYwcPcU6iGsKK_AvC171IFz1hj-0ZCU');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (38, 14, '2019-01-29 15:12:42', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTA3NjIsImlhdCI6MTU0ODc0NTk2MiwiYWNjb3VudCI6ImZlc3QifQ.jIZTtdi4a1JwORH333tDTMVjXTZ569DSYsUcKgGIVLk');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (39, 14, '2019-01-29 15:16:01', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTA5NjAsImlhdCI6MTU0ODc0NjE2MCwiYWNjb3VudCI6ImZlc3QifQ.RIU26uMfJqU29yYcjRyHZJt2PpRP40qhfRy7vPM-iis');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (40, 14, '2019-01-29 15:19:28', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTExNjcsImlhdCI6MTU0ODc0NjM2NywiYWNjb3VudCI6ImZlc3QifQ.Tp3IvNY5v2qL5sQRu5dsql1YRp3HFKa6-cEJM1JAqGI');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (41, 14, '2019-01-29 15:25:23', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTE1MjIsImlhdCI6MTU0ODc0NjcyMiwiYWNjb3VudCI6ImZlc3QifQ.YzEVCAc69ibIYH2J_nH5oTM_kh5NRB4oXxaAR2CIuyI');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (42, 18, '2019-01-29 15:25:44', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTE1NDMsImlhdCI6MTU0ODc0Njc0MywiYWNjb3VudCI6ImFhYSJ9.trg_A1IAuIMXPHZtfDANHWkIQvBtFcEkCVikjwEU0Nc');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (43, 19, '2019-01-29 15:27:03', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTE2MjIsImlhdCI6MTU0ODc0NjgyMiwiYWNjb3VudCI6ImFhYSJ9.jPPg2CeOXYpLhD2ekM2AFBvyD5LFPuMQCOuGbIS6OVQ');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (44, 14, '2019-01-29 15:29:38', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTE3NzcsImlhdCI6MTU0ODc0Njk3NywiYWNjb3VudCI6ImZlc3QifQ.uCCt69cyJI5iC7rJML33mZSfnnDoiYo4yYVH8i0URCY');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (45, 14, '2019-01-29 15:29:51', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTE3OTAsImlhdCI6MTU0ODc0Njk5MCwiYWNjb3VudCI6ImZlc3QifQ.Hqy99cdIxkOt9Y0tE-ZfOV6PNEbJ7oZ2_aoiQ3vqRvE');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (46, 19, '2019-01-29 15:30:04', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTE4MDMsImlhdCI6MTU0ODc0NzAwMywiYWNjb3VudCI6ImFhYSJ9.ulk8xnMtTxKUnr-uvxpqklJLhB_bFvOki-RbslbS5zo');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (47, 14, '2019-01-29 15:35:12', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTIxMTEsImlhdCI6MTU0ODc0NzMxMSwiYWNjb3VudCI6ImZlc3QifQ.03x39_WssOiX-xlaVB10xOUokBDlEBGAmJZqhbuIFy8');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (48, 14, '2019-01-29 15:37:00', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTIyMTksImlhdCI6MTU0ODc0NzQxOSwiYWNjb3VudCI6ImZlc3QifQ.dlV5CijW7yZoeJgQ3zB_nJMAJ-qlD5O8-k9mR4PZMZ8');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (49, 14, '2019-01-29 15:37:33', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTIyNTIsImlhdCI6MTU0ODc0NzQ1MiwiYWNjb3VudCI6ImZlc3QifQ.vZqNZ74QVg8QEGTiZ3hspQ6zczT9ukqoebxD2F_H5iw');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (50, 14, '2019-01-29 15:42:17', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTI1MzcsImlhdCI6MTU0ODc0NzczNywiYWNjb3VudCI6ImZlc3QifQ.cqwvjPJ6cxx6s0oxG20PPUaRQkI8kQv4_4zdMoZDbgU');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (51, 14, '2019-01-29 15:42:46', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTI1NjYsImlhdCI6MTU0ODc0Nzc2NiwiYWNjb3VudCI6ImZlc3QifQ.Yi9waymq9swWwtqBQ0OvuJ_5DNwMqwL7fTcFXFjg7iw');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (52, 14, '2019-01-29 15:43:35', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTI2MTQsImlhdCI6MTU0ODc0NzgxNCwiYWNjb3VudCI6ImZlc3QifQ.9ciyRoTKlz7S-oEk8JrUOiGlwCaTYiGDjHm4R6o4Wro');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (53, 14, '2019-01-29 15:46:26', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTI3ODUsImlhdCI6MTU0ODc0Nzk4NSwiYWNjb3VudCI6ImZlc3QifQ._GLrCHtv4ZHbzZoTkfbSRihdeLDIqqO8dmGmk-R-c1U');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (54, 14, '2019-01-29 15:47:28', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTI4NDcsImlhdCI6MTU0ODc0ODA0NywiYWNjb3VudCI6ImZlc3QifQ.S4MS-3xIFvFf8DNcq8Rdg0nOsxY4kwAAF-KD_QNDuA8');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (55, 14, '2019-01-29 15:47:34', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTI4NTQsImlhdCI6MTU0ODc0ODA1NCwiYWNjb3VudCI6ImZlc3QifQ.cTzysbrgiG-jOq9ot7Nsf3LpZtPUNuX_hjOH7cYKuUY');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (56, 14, '2019-01-29 15:49:44', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTI5ODMsImlhdCI6MTU0ODc0ODE4MywiYWNjb3VudCI6ImZlc3QifQ.5VOaRFjK9JaDKYwJstLQr609bFpxHkW7BLspUdf4fkM');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (57, 14, '2019-01-29 15:50:03', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTMwMDIsImlhdCI6MTU0ODc0ODIwMiwiYWNjb3VudCI6ImZlc3QifQ.eH0e7A2o0hbJlwKTQB9A_esuHirNYF4OeD2dxmmtiBc');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (58, 14, '2019-01-29 16:02:37', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTM3NTcsImlhdCI6MTU0ODc0ODk1NywiYWNjb3VudCI6ImZlc3QifQ.Q4tCgLz2tO3u_zv9t4CLS9gij76C8_1CyzXEqrZFCA4');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (59, 14, '2019-01-29 16:05:25', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTM5MjQsImlhdCI6MTU0ODc0OTEyNCwiYWNjb3VudCI6ImZlc3QifQ.LnLCDqNNAHy0Cm1BzNGVBz1kImKyqyI8_kD5dxnKTVU');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (60, 14, '2019-01-29 16:18:26', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTQ3MDUsImlhdCI6MTU0ODc0OTkwNSwiYWNjb3VudCI6ImZlc3QifQ.yKFwbkvEl3C5737qIuOCXXFLUjhMs_QhcWbiCkR0Rm8');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (61, 14, '2019-01-29 16:19:10', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTQ3NDksImlhdCI6MTU0ODc0OTk0OSwiYWNjb3VudCI6ImZlc3QifQ.fAjsmj9GWBN8SqCimmnsvmH2LS0Nq0Emn4fQeFIjxQE');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (62, 14, '2019-01-29 16:21:19', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTQ4NzksImlhdCI6MTU0ODc1MDA3OSwiYWNjb3VudCI6ImZlc3QifQ.9weVKEhGBiDpfGsBlzK-EjFig54G8Peda-P0eDZzQtA');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (63, 14, '2019-01-29 16:29:24', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTUzNjMsImlhdCI6MTU0ODc1MDU2MywiYWNjb3VudCI6ImZlc3QifQ.YV7baLWn0Sn74bRPrI0FaSFucp1Sjx1mDKiUYztL-Pg');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (64, 14, '2019-01-29 16:30:39', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTU0MzksImlhdCI6MTU0ODc1MDYzOSwiYWNjb3VudCI6ImZlc3QifQ.pqo73JGB-XNoufOixacePQlaTqGJO2mk8oPYwgJgIlY');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (65, 14, '2019-01-29 16:31:47', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTU1MDcsImlhdCI6MTU0ODc1MDcwNywiYWNjb3VudCI6ImZlc3QifQ.LstFqBMRF_Hm8y0yZIdp0-cw948i3_0VwwE-DTtKesY');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (66, 14, '2019-01-29 16:32:53', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTU1NzIsImlhdCI6MTU0ODc1MDc3MiwiYWNjb3VudCI6ImZlc3QifQ.w-YjfkJAXHjiju_mpTG3cQjeMVwtBGn0MRrX7YU46V4');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (67, 14, '2019-01-29 16:33:08', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTU1ODcsImlhdCI6MTU0ODc1MDc4NywiYWNjb3VudCI6ImZlc3QifQ.ZNtqBRuXlVagAGbFcoszuxM5hseJ1vS_0NHFs8Zk62c');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (68, 14, '2019-01-29 16:34:57', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTU2OTcsImlhdCI6MTU0ODc1MDg5NywiYWNjb3VudCI6ImZlc3QifQ.POCvt_4AsSU4FAElvA45gzJgIDKCo24x9jFpfx42SAA');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (69, 14, '2019-01-29 16:35:05', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTU3MDQsImlhdCI6MTU0ODc1MDkwNCwiYWNjb3VudCI6ImZlc3QifQ.8-oHZzELtkDHDYMBausmPW0LFLzd_JuEfjJyD_S7hAI');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (70, 14, '2019-01-29 16:35:27', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTU3MjYsImlhdCI6MTU0ODc1MDkyNiwiYWNjb3VudCI6ImZlc3QifQ.NKd21sXpEEv_KQsKRQus8o1T1rsgxkZOHlbFeNWJQ3k');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (71, 14, '2019-01-29 16:49:18', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTY1NTgsImlhdCI6MTU0ODc1MTc1OCwiYWNjb3VudCI6ImZlc3RjaGVsbGluQGdtYWlsLmNvbSJ9.9jW5EMYqstF1-ennt0UII0a-2BBpJ25YlnaVFewtQfk');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (72, 14, '2019-01-29 16:49:41', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTY1ODAsImlhdCI6MTU0ODc1MTc4MCwiYWNjb3VudCI6ImZlc3RjaGVsbGluQGdtYWlsLmNvbSJ9.3kgDfaZNzdGoOV_SkQDkVXKQMhDYLvqbzAf_WpHueQs');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (73, 14, '2019-01-29 16:52:25', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTY3NDUsImlhdCI6MTU0ODc1MTk0NSwiYWNjb3VudCI6ImZlc3RjaGVsbGluQGdtYWlsLmNvbSJ9.0_kmvdo0n8EI6nYNrZgHMLWLzs8ZiuOdaVS1OiW7oNc');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (74, 20, '2019-01-29 16:52:52', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTY3NzEsImlhdCI6MTU0ODc1MTk3MSwiYWNjb3VudCI6ImZlc3QifQ.-f6QL127FBZ8v4ybZQ7ZJjNenifoovSMJa9E3nBxg2k');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (75, 14, '2019-01-29 16:53:36', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDkzNTY4MTYsImlhdCI6MTU0ODc1MjAxNiwiYWNjb3VudCI6ImZlc3RjaGVsbGluQGdtYWlsLmNvbSJ9.mLMr4Z57HB1OB63zyEMnDDRBRqWQHpGBUivsbWz4TB4');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (76, 20, '2019-01-30 10:22:51', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDk0MTk3NzEsImlhdCI6MTU0ODgxNDk3MSwiYWNjb3VudCI6ImZlc3QifQ._815y7qFlk5b0HLnNDTTjQhFrLVt70LJEkDhiycYmMo');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (77, 14, '2019-01-30 10:23:08', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDk0MTk3ODcsImlhdCI6MTU0ODgxNDk4NywiYWNjb3VudCI6ImZlc3RjaGVsbGluQGdtYWlsLmNvbSJ9.W44GNKMGRc5vMUEBTOJB9x0vp2wIlLHD3vRIAxc94bA');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (78, 14, '2019-01-30 11:07:28', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NDk0MjI0NDgsImlhdCI6MTU0ODgxNzY0OCwiYWNjb3VudCI6ImZlc3RjaGVsbGluQGdtYWlsLmNvbSJ9.XeKMJfuYB13h4FgrZnWDpDVv6RUh9Ygbju00IXHlHfk');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (79, 20, '2019-03-05 14:50:19', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzNzM0MTksImlhdCI6MTU1MTc2ODYxOSwiYWNjb3VudCI6ImZlc3QifQ.ERNOLEYVUVJrGabf9q8Vu30cAcdYOKyLYLw-9ZiDuxQ');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (80, 20, '2019-03-05 14:50:28', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzNzM0MjcsImlhdCI6MTU1MTc2ODYyNywiYWNjb3VudCI6ImZlc3QifQ.-wWQR_H6M8eY33BSc9VyS6dter3EG5SSy_qo89Cr_hA');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (81, 20, '2019-03-05 14:52:23', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzNzM1NDMsImlhdCI6MTU1MTc2ODc0MywiYWNjb3VudCI6ImZlc3QifQ.ec6GSkw8dYz6KKwbd4zUSvj14RBTMMMFecdf5cKXGoI');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (82, 20, '2019-03-05 14:53:56', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzNzM2MzUsImlhdCI6MTU1MTc2ODgzNSwiYWNjb3VudCI6ImZlc3QifQ.AGbYCqAixsYFmtsmlr6aH4hS5IIbxyNNOu5KQDPHP2s');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (83, 20, '2019-03-05 15:05:38', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzNzQzMzcsImlhdCI6MTU1MTc2OTUzNywiYWNjb3VudCI6ImZlc3QifQ.toPnpDqOA-QPrPh_00VK8QZuYc-r9nDRKein2rjoTZI');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (84, 20, '2019-03-05 15:09:00', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzNzQ1NDAsImlhdCI6MTU1MTc2OTc0MCwiYWNjb3VudCI6ImZlc3QifQ.rxStQZUDefXb2B65JrqgJwtVG1tmWeTbwTwjfEhZCao');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (85, 20, '2019-03-05 15:17:03', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzNzUwMjIsImlhdCI6MTU1MTc3MDIyMiwiYWNjb3VudCI6ImZlc3QifQ.W4v7124gcfkcuzfYauzvGYLl948mOaZz0QBSn9SP31M');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (86, 20, '2019-03-05 15:17:03', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzNzUwMjIsImlhdCI6MTU1MTc3MDIyMiwiYWNjb3VudCI6ImZlc3QifQ.W4v7124gcfkcuzfYauzvGYLl948mOaZz0QBSn9SP31M');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (87, 20, '2019-03-05 15:17:04', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzNzUwMjMsImlhdCI6MTU1MTc3MDIyMywiYWNjb3VudCI6ImZlc3QifQ.J0s7HkQo_Y_DhYKBSKftk54kVQRuEd49_GJ-HTDdIjg');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (88, 20, '2019-03-05 15:17:06', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzNzUwMjYsImlhdCI6MTU1MTc3MDIyNiwiYWNjb3VudCI6ImZlc3QifQ.amdOiz2WdxGahBbuDXtbMYZ1m_JFl_IseXCAHkFDcNw');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (89, 20, '2019-03-05 15:17:09', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzNzUwMjksImlhdCI6MTU1MTc3MDIyOSwiYWNjb3VudCI6ImZlc3QifQ.BYlvv4ArZTQNVWmVfYFyEhFbIlgs7_xBzf--z3T5E7A');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (90, 20, '2019-03-05 15:18:52', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzNzUxMzEsImlhdCI6MTU1MTc3MDMzMSwiYWNjb3VudCI6ImZlc3QifQ.nj8O981UGBM8SXHbiDtENsWTK98zR4srPqnKKvTABaM');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (91, 20, '2019-03-05 15:21:25', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzNzUyODQsImlhdCI6MTU1MTc3MDQ4NCwiYWNjb3VudCI6ImZlc3QifQ.hl7fzgiVnSPpPcSJs3oXVzmoYdzIXHcENmcpdkYHtJg');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (92, 20, '2019-03-05 15:22:52', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzNzUzNzEsImlhdCI6MTU1MTc3MDU3MSwiYWNjb3VudCI6ImZlc3QifQ.Kk-1Hio5RCkQiCX1oAkwNokZrxawvaFLtrbryH4nmNA');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (93, 20, '2019-03-05 15:24:39', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzNzU0NzksImlhdCI6MTU1MTc3MDY3OSwiYWNjb3VudCI6ImZlc3QifQ.sB3ol_5exYWQSbbAyidyTyP8a2_T5uzXMSh9-rloPfY');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (94, 11, '2019-03-05 15:25:44', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM3NTU0MywiaWF0IjoxNTUxNzcwNzQzLCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.NB5W8jPYh_yDHoVXZD1b1ZK1VPklmCJ9t5WdPAxm7XU');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (95, 11, '2019-03-05 15:34:47', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM3NjA4NywiaWF0IjoxNTUxNzcxMjg3LCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.AJIETyhTaqX2rExuCJhxKqHZOhrx0HPnW5j8EEyvXWs');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (96, 11, '2019-03-05 15:35:11', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM3NjExMCwiaWF0IjoxNTUxNzcxMzEwLCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.IfLPnW3SL_Hb73g9-2X_S-rtFkGFIeGBMtnIjsKLk5s');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (97, 11, '2019-03-05 15:35:29', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM3NjEyOSwiaWF0IjoxNTUxNzcxMzI5LCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.KWDK2mU2rQh7c1s_TTqptOVdYJ8XbbtwrY8uGn2qIwo');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (98, 11, '2019-03-05 15:36:13', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM3NjE3MiwiaWF0IjoxNTUxNzcxMzcyLCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.WCF00CYN3LQVZT9NEgrVp6Ae59_ii4VFBso5w_VWGC8');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (99, 20, '2019-03-05 15:38:52', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzNzYzMzEsImlhdCI6MTU1MTc3MTUzMSwiYWNjb3VudCI6ImZlc3QifQ.PmLgz1oaggoKCt-my1tXIKL2LoU18JCWU5Ot7ktFnzk');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (100, 20, '2019-03-05 16:10:55', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzNzgyNTQsImlhdCI6MTU1MTc3MzQ1NCwiYWNjb3VudCI6ImZlc3QifQ.k8bV4CefzMIk_OjzMbR8Y3OofvWNdzi-75WQYY_6qBs');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (101, 20, '2019-03-05 16:27:02', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzNzkyMjEsImlhdCI6MTU1MTc3NDQyMSwiYWNjb3VudCI6ImZlc3QifQ.N3ooR1lBPto1vCTKotGmb_GRgETVGLJH6Z8ItYZXObw');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (102, 20, '2019-03-05 16:33:22', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzNzk2MDEsImlhdCI6MTU1MTc3NDgwMSwiYWNjb3VudCI6ImZlc3QifQ.I50OxxB3YgIuzI_qc1fs9IixIsLOd9I-51dPF0j9-nM');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (103, 21, '2019-03-05 16:41:15', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzODAwNzUsImlhdCI6MTU1MTc3NTI3NSwiYWNjb3VudCI6ImFhYWEifQ.7MGXVWsJ5_-seH6Wq0DGAYFDgJyNGU3w8PtDbMvgOU4');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (104, 22, '2019-03-05 16:41:51', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzODAxMTEsImlhdCI6MTU1MTc3NTMxMSwiYWNjb3VudCI6ImFhYWExIn0.wwnTWctKA_kCQl66NRCi_tPppHiDJrB32e0DnF_yHcI');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (105, 11, '2019-03-05 16:46:23', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM4MDM4MywiaWF0IjoxNTUxNzc1NTgzLCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.C0uBEOBC-m4wbLyVLyj20y9D3xWSvUfOQK-_CTQh_Hw');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (106, 11, '2019-03-05 16:47:07', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM4MDQyNiwiaWF0IjoxNTUxNzc1NjI2LCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.EfSkJ4CanfB1b-ka2BO9ZqRi-TVMJg5W9bPYc2dCxRI');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (107, 11, '2019-03-05 16:48:20', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM4MDQ5OSwiaWF0IjoxNTUxNzc1Njk5LCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.6_AkLR7l6aNPVZFAxVwtOnWwyJ00QnLn_-m_m4BVAtg');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (108, 11, '2019-03-05 16:48:42', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM4MDUyMSwiaWF0IjoxNTUxNzc1NzIxLCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.cvhOVuHVCvvtky8Fpj96jgN2XRiABLBTkEHF-p5gz-A');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (109, 11, '2019-03-05 16:54:14', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM4MDg1NCwiaWF0IjoxNTUxNzc2MDU0LCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.yJ7meoDY3XeIwZx6sgCFSzAqxIcj9mpQAcSn1NO6hmo');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (110, 11, '2019-03-05 16:54:47', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM4MDg4NiwiaWF0IjoxNTUxNzc2MDg2LCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.rgqlGFIZT6z013Ap9i1m7JBorhZ73YOwdrKO9m6iXPQ');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (111, 11, '2019-03-05 16:57:19', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM4MTAzOSwiaWF0IjoxNTUxNzc2MjM5LCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.AUmdYAR6f0dYvA_lEYqhq-KTF_dPRV2dhlFn0jekcSw');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (112, 11, '2019-03-05 16:58:08', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM4MTA4OCwiaWF0IjoxNTUxNzc2Mjg4LCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.Mx0GrOvxJLU6eNyiHnGkLFrXyQX19RS4qqxl8BThJzs');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (113, 11, '2019-03-05 16:58:32', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM4MTExMSwiaWF0IjoxNTUxNzc2MzExLCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.5SOIJwKlvbO5a7kheyRV9xis-TXF6fp4hz8F6i6YxQk');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (114, 11, '2019-03-05 16:58:35', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM4MTExNSwiaWF0IjoxNTUxNzc2MzE1LCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.y4-TnuUPkWGfkvwa4sKFblYRgHw6wzBjqWJCrdfaWzo');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (115, 11, '2019-03-05 16:59:10', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM4MTE1MCwiaWF0IjoxNTUxNzc2MzUwLCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.Qk7vVjEwWlblbqsdcMuuI9PAd6dJ3rUMC3xgyh70lvc');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (116, 11, '2019-03-05 17:07:37', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM4MTY1NiwiaWF0IjoxNTUxNzc2ODU2LCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.XvYMaAgxqOb6nnKUvijJtWs7qhPhpn1CHSRMid-cH7U');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (117, 11, '2019-03-05 17:07:41', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM4MTY2MCwiaWF0IjoxNTUxNzc2ODYwLCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.1e8kedOsYMdDN7jrFg8-ZRpfqEkS6sRPOZlQNHMEeVk');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (118, 11, '2019-03-05 17:37:07', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM4MzQyNywiaWF0IjoxNTUxNzc4NjI3LCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.X3M99z9Fpiai_hdVboa2-XyZMadU6bYX_rSqmarp8Xo');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (119, 11, '2019-03-05 17:51:22', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM4NDI4MiwiaWF0IjoxNTUxNzc5NDgyLCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.0gS8yZg1188ecGFoEbt9zmOJIJ4SYuF5UdyIRyQw18A');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (120, 11, '2019-03-05 18:13:12', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM4NTU5MiwiaWF0IjoxNTUxNzgwNzkyLCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.ZMUMGJcOh3L4N4E_52T0efQ247pW1SEzzkJco4ctQi4');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (121, 23, '2019-03-05 18:13:29', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTIzODU2MDksImlhdCI6MTU1MTc4MDgwOSwiYWNjb3VudCI6IjExMTExIn0.sJgQjzRQsQ0YWJlX4QAZHnLk-odyFlenRhAAV_chH80');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (122, 11, '2019-03-05 18:14:58', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjM4NTY5NywiaWF0IjoxNTUxNzgwODk3LCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.potDmaX1b0Gfl2FTtrEf8TcO6XGMg7ldDj_9QIwzNe0');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (123, 20, '2019-03-06 13:43:03', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOmZhbHNlLCJleHAiOjE1NTI0NTU3ODMsImlhdCI6MTU1MTg1MDk4MywiYWNjb3VudCI6ImZlc3QifQ.wnG5f_DyS4rTCta7PXYi1bY8p3RiqagXsz0kou2GC5I');
INSERT INTO test.tb_user_log (id, user_id, login_time, user_token) VALUES (124, 11, '2019-03-06 13:56:07', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZG1pblJvbGUiOnRydWUsImV4cCI6MTU1MjQ1NjU2NiwiaWF0IjoxNTUxODUxNzY2LCJhY2NvdW50IjoiMTIzNDU2Nzg5In0.Yp8d8_-Dbf_V9LZ6Wxw8TP-wpWCySdsozxATgtDKZu4');
create table tb_video
(
  id           bigint auto_increment
    primary key,
  name         varchar(32)  null comment '影片名称',
  description  tinytext     null comment '影片简介',
  url          varchar(255) null comment '影片地址',
  release_time datetime     null comment '上映时间',
  author_id    int          not null comment '作者',
  poster       varchar(255) not null comment '视频略缩图',
  constraint tb_video_name_uindex
    unique (name)
);


create table tb_vote
(
  id             int auto_increment
    primary key,
  uuid           varchar(255)  not null,
  vate_time      datetime      null,
  voter_id       int           not null,
  state          int default 0 null,
  vote_classname varchar(255)  null,
  constraint tb_vote_uuid_uindex
    unique (uuid)
);


create definer = root@localhost view v_test_tb as
select `tables`.`TABLE_NAME` AS `TABLE_NAME`, `tables`.`TABLE_COMMENT` AS `TABLE_COMMENT`
from `information_schema`.`TABLES`
where ((`tables`.`TABLE_SCHEMA` = 'test') and (`tables`.`TABLE_TYPE` = 'BASE TABLE'));

INSERT INTO test.v_test_tb (TABLE_NAME, TABLE_COMMENT) VALUES ('tb_category', '视频分类表');
INSERT INTO test.v_test_tb (TABLE_NAME, TABLE_COMMENT) VALUES ('tb_user', 'user表');
INSERT INTO test.v_test_tb (TABLE_NAME, TABLE_COMMENT) VALUES ('tb_user_info', '');
INSERT INTO test.v_test_tb (TABLE_NAME, TABLE_COMMENT) VALUES ('tb_user_log', '');
INSERT INTO test.v_test_tb (TABLE_NAME, TABLE_COMMENT) VALUES ('tb_video', '');
INSERT INTO test.v_test_tb (TABLE_NAME, TABLE_COMMENT) VALUES ('tb_vote', '');
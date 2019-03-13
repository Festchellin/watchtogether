package com.fest.watchtogether.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserInfo implements Serializable {
	private Long id;
	private User user;
	private Date registerDate;
	private Date lastModifyTime;
	private String email;
	private String phoneNumber;
	private String avatar;
}

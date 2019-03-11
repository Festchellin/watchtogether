package com.fest.watchtogether.entity;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserLog implements Serializable {
	private Long id;
	private User user;
	private String userToken;
	private Date loginTime;
}

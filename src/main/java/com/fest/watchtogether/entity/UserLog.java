package com.fest.watchtogether.entity;


import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName UserLog
 * @Description
 * @Author Festchellin
 * @Date 1/1/2019  3:19 PM
 * @Version 1.0
 */

public class UserLog implements Serializable {
	private Long id;
	private User user;
	private String userToken;
	private Date loginTime;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getUserToken() {
		return userToken;
	}
	
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	
	public Date getLoginTime() {
		return loginTime;
	}
	
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	
	@Override
	public String toString() {
		return "UserLog{" +
				"id=" + id +
				", user=" + user +
				", userToken='" + userToken + '\'' +
				", loginTime=" + loginTime +
				'}';
	}
}

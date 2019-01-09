package com.fest.watchtogether.entity;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description
 * @Author Festchellin
 * @Date 12/31/2018  1:21 PM
 * @Version 1.0
 */
public class User implements Serializable {
	private Long id;
	private String account;
	private String name;
	private String password;
	private Boolean adminRole = false;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getAccount() {
		return account;
	}
	
	public void setAccount(String account) {
		this.account = account;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Boolean getAdminRole() {
		return adminRole;
	}
	
	public void setAdminRole(Boolean adminRole) {
		this.adminRole = adminRole;
	}
	
	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", account='" + account + '\'' +
				", name='" + name + '\'' +
				", password='" + password + '\'' +
				", adminRole=" + adminRole +
				'}';
	}
}

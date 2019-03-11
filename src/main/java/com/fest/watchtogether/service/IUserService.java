package com.fest.watchtogether.service;

import com.fest.watchtogether.entity.User;

import java.util.List;
import java.util.Map;

public interface IUserService extends IBaseService<User> {
	User getByAccountAndPassword(String account, String password, Boolean adminRole);
	
	List getUserListByConditions(Map conditions);
}

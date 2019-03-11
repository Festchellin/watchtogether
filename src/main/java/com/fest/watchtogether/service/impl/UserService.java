package com.fest.watchtogether.service.impl;

import com.fest.watchtogether.dao.UserDao;
import com.fest.watchtogether.entity.User;
import com.fest.watchtogether.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService implements IUserService {
	private final UserDao userDao;
	
	@Autowired
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public Boolean save(User instance) {
		return userDao.save(instance);
	}
	
	@Override
	public Boolean deleteById(Integer id) {
		return userDao.deleteById(id);
	}
	
	@Override
	public Boolean update(User instance) {
		return userDao.update(instance);
	}
	
	@Override
	public User getById(User user) {
		return userDao.getById(user);
	}
	
	@Override
	public List getListByCondition(Map conditions) {
		return userDao.getListByConditions(conditions);
	}
	
	@Override
	public User getByAccountAndPassword(String account, String password, Boolean adminRole) {
		return userDao.getByAccountAndPassword(account, password, adminRole);
	}
	
	@Override
	public List getUserListByConditions(Map conditions) {
		return userDao.getUserListByConditions(conditions);
	}
	
}

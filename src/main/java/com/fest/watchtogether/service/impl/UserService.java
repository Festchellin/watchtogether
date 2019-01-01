package com.fest.watchtogether.service.impl;

import com.fest.watchtogether.dao.UserDao;
import com.fest.watchtogether.entity.User;
import com.fest.watchtogether.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserService
 * @Description
 * @Author Festchellin
 * @Date 12/31/2018  4:26 PM
 * @Version 1.0
 */
@Service
public class UserService implements IUserService {
	@Autowired
	private UserDao userDao;
	@Override
	public Boolean save(User instance) {
		return null;
	}
	
	@Override
	public Boolean deleteById(Integer id) {
		return null;
	}
	
	@Override
	public Boolean update(User instance) {
		return null;
	}
	
	@Override
	public User getById(Integer id) {
		return null;
	}
	
	@Override
	public List getListByCondition(Map conditons) {
		return userDao.getListByConditions(conditons);
	}
}

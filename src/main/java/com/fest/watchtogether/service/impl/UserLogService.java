package com.fest.watchtogether.service.impl;

import com.fest.watchtogether.dao.UserLogDao;
import com.fest.watchtogether.entity.User;
import com.fest.watchtogether.entity.UserLog;
import com.fest.watchtogether.service.IUserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserLogService
 * @Description
 * @Author Festchellin
 * @Date 1/1/2019  3:46 PM
 * @Version 1.0
 */

@Service
public class UserLogService implements IUserLogService {
	private final UserLogDao userLogDao;
	
	@Autowired
	public UserLogService(UserLogDao userLogDao) {
		this.userLogDao = userLogDao;
	}
	
	@Override
	public UserLog getLatestLogByUser(Long id) {
		return userLogDao.getLatestLogByUser(id);
	}
	
	@Override
	public UserLog getUserLogByUserToken(String userToken) {
		return userLogDao.getUserLogByToken(userToken);
	}
	
	@Override
	public Boolean save(UserLog instance) {
		return userLogDao.save(instance);
	}
	
	@Override
	public Boolean deleteById(Integer id) {
		return null;
	}
	
	@Override
	public Boolean update(UserLog instance) {
		return null;
	}
	
	@Override
	public UserLog getById(UserLog userLog) {
		return null;
	}
	
	@Override
	public List getListByCondition(Map conditons) {
		return null;
	}
}

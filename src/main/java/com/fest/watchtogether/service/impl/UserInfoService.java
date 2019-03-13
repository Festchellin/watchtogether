package com.fest.watchtogether.service.impl;

import com.fest.watchtogether.dao.UserInfoDao;
import com.fest.watchtogether.entity.UserInfo;
import com.fest.watchtogether.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserInfoService implements IUserInfoService {
	private final UserInfoDao userInfoDao;
	
	@Autowired
	public UserInfoService(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}
	
	@Override
	public Boolean save(UserInfo instance) {
		return userInfoDao.save(instance);
	}
	
	@Override
	public Boolean deleteById(Integer id) {
		return userInfoDao.deleteById(id);
	}
	
	@Override
	public Boolean update(UserInfo instance) {
		return userInfoDao.update(instance);
	}
	
	@Override
	public UserInfo getById(UserInfo instance) {
		return userInfoDao.getById(instance);
	}
	
	@Override
	public List<UserInfo> getListByCondition(Map conditions) {
		return userInfoDao.getListByConditions(conditions);
	}
}

package com.fest.watchtogether.service;

import com.fest.watchtogether.entity.UserLog;

public interface IUserLogService extends IBaseService<UserLog> {
	UserLog getLatestLogByUser(Long id);
	
	UserLog getUserLogByUserToken(String userToken);
}

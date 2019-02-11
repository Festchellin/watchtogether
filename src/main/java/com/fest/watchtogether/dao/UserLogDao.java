package com.fest.watchtogether.dao;

import com.fest.watchtogether.entity.UserLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserLogDao extends BaseDao<UserLog> {
	UserLog getLatestLogByUser(Long uid);
	
	UserLog getUserLogByToken(String userToken);
}

package com.fest.watchtogether.dao;

import com.fest.watchtogether.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface UserDao extends BaseDao<User> {
	User getByAccountAndPassword(@Param("account") String account, @Param("password") String password, @Param("adminRole") Boolean adminRole);
	
	List getUserListByConditions(Map conditions);
}

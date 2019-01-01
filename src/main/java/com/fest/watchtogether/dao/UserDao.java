package com.fest.watchtogether.dao;

import com.fest.watchtogether.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao extends BaseDao<User> {

}

package com.fest.watchtogether.dao;

import com.fest.watchtogether.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserInfoDao extends BaseDao<UserInfo> {
}

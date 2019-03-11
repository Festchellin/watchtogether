package com.fest.watchtogether.dao;

import com.fest.watchtogether.entity.Vote;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface VoteDao extends BaseDao<Vote> {
}

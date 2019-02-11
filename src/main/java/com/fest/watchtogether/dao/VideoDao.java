package com.fest.watchtogether.dao;

import com.fest.watchtogether.entity.Video;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface VideoDao extends BaseDao<Video> {
}

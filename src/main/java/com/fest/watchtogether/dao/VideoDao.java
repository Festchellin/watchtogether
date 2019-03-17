package com.fest.watchtogether.dao;

import com.fest.watchtogether.entity.Video;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface VideoDao extends BaseDao<Video> {
	List<Video> getListByUserId(@Param("id") Integer id);
}


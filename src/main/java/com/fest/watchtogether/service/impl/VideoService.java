package com.fest.watchtogether.service.impl;

import com.fest.watchtogether.dao.VideoDao;
import com.fest.watchtogether.entity.Video;
import com.fest.watchtogether.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class VideoService implements IVideoService {
	private final VideoDao videoDao;
	
	@Autowired
	public VideoService(VideoDao videoDao) {
		this.videoDao = videoDao;
	}
	
	@Override
	public Boolean save(Video instance) {
		return videoDao.save(instance);
	}
	
	@Override
	public Boolean deleteById(Integer id) {
		return videoDao.deleteById(id);
	}
	
	@Override
	public Boolean update(Video instance) {
		return videoDao.update(instance);
	}
	
	@Override
	public Video getById(Video instance) {
		return videoDao.getById(instance);
	}
	
	@Override
	public List<Video> getListByCondition(Map conditions) {
		return videoDao.getListByConditions(conditions);
	}
	
	public List<Video> getListByUserId(Integer id) {
		return videoDao.getListByUserId(id);
	}
}

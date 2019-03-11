package com.fest.watchtogether.service.impl;

import com.fest.watchtogether.dao.VoteDao;
import com.fest.watchtogether.entity.Vote;
import com.fest.watchtogether.service.IVoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class VoteService implements IVoteService {
	private final VoteDao voteDao;
	
	@Autowired
	public VoteService(VoteDao voteDao) {
		this.voteDao = voteDao;
	}
	
	@Override
	public Boolean save(Vote instance) {
		return voteDao.save(instance);
	}
	
	@Override
	public Boolean deleteById(Integer id) {
		return voteDao.deleteById(id);
	}
	
	@Override
	public Boolean update(Vote instance) {
		return voteDao.update(instance);
	}
	
	@Override
	public Vote getById(Vote instance) {
		return voteDao.getById(instance);
	}
	
	@Override
	public List<Vote> getListByCondition(Map conditions) {
		return voteDao.getListByConditions(conditions);
	}
}

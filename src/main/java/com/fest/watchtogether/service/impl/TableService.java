package com.fest.watchtogether.service.impl;

import com.fest.watchtogether.dao.TableDao;
import com.fest.watchtogether.entity.Table;
import com.fest.watchtogether.service.ITableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TableService implements ITableService {
	private final TableDao tableDao;
	
	@Autowired
	public TableService(TableDao tableDao) {
		this.tableDao = tableDao;
	}
	
	@Override
	public List<Table> getAllTables() {
		return tableDao.getAllTables();
	}
	
	@Override
	public List<Table> getAllUserTables() {
		return tableDao.getAllUserTables();
	}
	
	@Override
	public List<Table> getAdminMenu() {
		return tableDao.getAdminMenu();
	}
	
	@Override
	public Boolean save(Table instance) {
		return tableDao.save(instance);
	}
	
	@Override
	public Boolean deleteById(Integer id) {
		return tableDao.deleteById(id);
	}
	
	@Override
	public Boolean update(Table instance) {
		return tableDao.update(instance);
	}
	
	@Override
	public Table getById(Table instance) {
		return null;
	}
	
	@Override
	public List<Table> getListByCondition(Map conditions) {
		return null;
	}
}

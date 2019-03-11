package com.fest.watchtogether.service;

import com.fest.watchtogether.entity.Table;

import java.util.List;

public interface ITableService extends IBaseService<Table>{
	List<Table> getAllTables();
	List<Table> getAllUserTables();
}

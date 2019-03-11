package com.fest.watchtogether.dao;

import java.util.List;
import java.util.Map;

public interface BaseDao<T> {
	
	Boolean save(T instance);
	
	Boolean deleteById(Integer id);
	
	Boolean update(T instance);
	
	T getById(T instance);
	
	List getListByConditions(Map conditions);
}

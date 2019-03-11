package com.fest.watchtogether.service;

import java.util.List;
import java.util.Map;

public interface IBaseService<T> {
	Boolean save(T instance);
	
	Boolean deleteById(Integer id);
	
	Boolean update(T instance);
	
	T getById(T instance);
	
	List<T> getListByCondition(Map conditions);
}

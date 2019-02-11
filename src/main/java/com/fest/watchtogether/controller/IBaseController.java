package com.fest.watchtogether.controller;

import com.fest.watchtogether.util.Condition;

public interface IBaseController<T> {
	Object getById(Long id);
	
	Object save(T instance);
	
	Object deleteById(Long id);
	
	Object update(T instance);
	
	Object getListByConditions(
			Condition condition,
			Integer page,
			Integer pageSize);
}

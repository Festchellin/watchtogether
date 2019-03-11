package com.fest.watchtogether.service.impl;

import com.fest.watchtogether.dao.CategoryDao;
import com.fest.watchtogether.entity.Category;
import com.fest.watchtogether.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CategoryService implements ICategoryService {
	private final CategoryDao categoryMapper;
	
	@Autowired
	public CategoryService(CategoryDao categoryDao) {
		this.categoryMapper = categoryDao;
	}
	
	
	@Override
	public Boolean save(Category instance) {
		return categoryMapper.save(instance);
	}
	
	@Override
	public Boolean deleteById(Integer id) {
		return categoryMapper.deleteById(id);
	}
	
	@Override
	public Boolean update(Category instance) {
		return categoryMapper.update(instance);
	}
	
	@Override
	public Category getById(Category instance) {
		return categoryMapper.getById(instance);
	}
	
	@Override
	public List<Category> getListByCondition(Map conditions) {
		return categoryMapper.getListByConditions(conditions);
	}
}

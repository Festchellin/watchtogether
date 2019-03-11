package com.fest.watchtogether.dao;

import com.fest.watchtogether.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CategoryDao extends BaseDao<Category> {
}

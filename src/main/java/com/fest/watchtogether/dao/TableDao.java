package com.fest.watchtogether.dao;

import com.fest.watchtogether.entity.Table;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TableDao extends BaseDao<Table>{
	List<Table> getAllTables();
	List<Table> getAllUserTables();
}

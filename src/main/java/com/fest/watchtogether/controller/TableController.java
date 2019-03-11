package com.fest.watchtogether.controller;

import com.fest.watchtogether.entity.Table;
import com.fest.watchtogether.service.impl.TableService;
import com.fest.watchtogether.util.AssembleUtils;
import com.fest.watchtogether.util.Condition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/table")
public class TableController implements IBaseController<Table>{
	private final TableService tableService;
	private Map<String, Object> response = new HashMap<>();
	private Map<String, Object> data = new HashMap<>();
	
	@Autowired
	public TableController(TableService tableService) {
		this.tableService = tableService;
	}
	
	@GetMapping
	public Object getAllTables(Integer type) {
		response.clear();
		data.clear();
		List<Table> tables = null;
		try {
			tables = type == 2 ? tableService.getAllTables() : tableService.getAllUserTables();
			data.put("tables", tables);
			response = AssembleUtils.assembleResponse("get data successfully", true, data);
		} catch (Exception e) {
			response = AssembleUtils.assembleResponse("can not get data caused by:" + e.getMessage(), false, null);
		}
		return response;
	}
	
	@Override
	public Object getById(Long id) {
		return null;
	}
	
	@Override
	@PostMapping
	public Object save(@RequestBody Table instance) {
		response.clear();
		try {
			Boolean save = tableService.save(instance);
			response = AssembleUtils.assembleResponse(save ? "saved" : "do not save", save, null);
		}catch (Exception e){
			response = AssembleUtils.assembleResponse("do not save caused by:"+e.getMessage(), false, null);
		}
		return response;
	}
	
	@DeleteMapping("{id}")
	@Override
	public Object deleteById(@PathVariable Long id) {
		response.clear();
		try {
			Boolean delete = tableService.deleteById(id.intValue());
			response = AssembleUtils.assembleResponse(delete ? "deleted" : "do not delete", delete, null);
		}catch (Exception e){
			response = AssembleUtils.assembleResponse("do not delete caused by "+e.getMessage(),false,null);
		}
		return response;
	}
	
	@PutMapping
	@Override
	public Object update(@RequestBody Table instance) {
		response.clear();
		try {
			Boolean update = tableService.update(instance);
			response = AssembleUtils.assembleResponse(update ? "updated" : "do not update", update, null);
		}catch (Exception e){
			response = AssembleUtils.assembleResponse("do not update caused by "+ e.getMessage(),false,null);
		}
		return response;
	}
	
	@Override
	public Object getListByConditions(Condition condition, Integer page, Integer pageSize) {
		return null;
	}
}

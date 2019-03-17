package com.fest.watchtogether.controller;

import com.fest.watchtogether.service.IBaseService;
import com.fest.watchtogether.util.AssembleUtils;
import com.fest.watchtogether.util.Condition;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BaseController<T> implements IBaseController<T> {
	IBaseService<T> baseService;
	Map<String, Object> response = new HashMap<>();
	Map<String, Object> data = new HashMap<>();
	
	public BaseController(IBaseService<T> baseService) {
		this.baseService = baseService;
	}
	
	@Override
	public Object save(T instance) {
		response.clear();
		try {
			Boolean save = baseService.save(instance);
			response = AssembleUtils.assembleResponse(save ? "Saved" : "Not saved", save, null);
		} catch (Exception e) {
			response = AssembleUtils.assembleResponse("Not saved caused by:" + e.getMessage(), false, null);
		}
		return response;
	}
	
	@Override
	public Object deleteById(Long id) {
		response.clear();
		try {
			Boolean delete = baseService.deleteById(id.intValue());
			response = AssembleUtils.assembleResponse(delete ? "Deleted" : "Not deleted", delete, null);
		} catch (Exception e) {
			response = AssembleUtils.assembleResponse("Not deleted caused by:" + e.getMessage(), false, null);
		}
		return response;
	}
	
	@Override
	public Object update(T instance) {
		response.clear();
		try {
			Boolean update = baseService.update(instance);
			response = AssembleUtils.assembleResponse(update ? "Updated" : "Not updated", update, null);
		} catch (Exception e) {
			response = AssembleUtils.assembleResponse("Not updated caused by:" + e.getMessage(), false, null);
		}
		return response;
	}
	
	@Override
	public Object getListByConditions(Condition condition, Integer page, Integer pageSize) {
		response.clear();
		data.clear();
		Map<String, Object> conditions = AssembleUtils.assembleConditions(page, pageSize, condition);
		try {
			List<T> list = baseService.getListByCondition(conditions);
			Boolean success = list != null;
			data.put("list", list);
			response = AssembleUtils.assembleResponse(success ? "get data successfully" : "do not get date", success, success ? data : null);
		} catch (Exception e) {
			response = AssembleUtils.assembleResponse("do not get date caused by:" + e.getMessage(), false, null);
		}
		return response;
	}
}

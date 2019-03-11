package com.fest.watchtogether.controller;

import com.fest.watchtogether.entity.UserLog;
import com.fest.watchtogether.service.IUserLogService;
import com.fest.watchtogether.util.AssembleUtils;
import com.fest.watchtogether.util.Condition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/userlog")
public class UserLogController implements IBaseController<UserLog> {
	private final IUserLogService userLogService;
	private Map<String, Object> response = new HashMap<>();
	private Map<String, Object> data = new HashMap<>();
	
	@Autowired
	public UserLogController(IUserLogService userLogService) {
		this.userLogService = userLogService;
	}
	
	@Override
	public Object getById(Long id) {
		return null;
	}
	
	@Override
	public Object save(UserLog instance) {
		return null;
	}
	
	@Override
	@DeleteMapping("{id}")
	public Object deleteById(@PathVariable Long id) {
		response.clear();
		try {
			Boolean delete = userLogService.deleteById(id.intValue());
			response = AssembleUtils.assembleResponse(delete ? "delete successfully" : "delete failed", delete, null);
		} catch (Exception e) {
			response = AssembleUtils.assembleResponse("delete failed caused by:" + e.getMessage(), false, null);
		}
		return response;
	}
	
	@Override
	public Object update(UserLog instance) {
		return null;
	}
	
	@Override
	@GetMapping
	public Object getListByConditions(Condition condition, Integer page, Integer pageSize) {
		response.clear();
		data.clear();
		Map<String, Object> conditions = AssembleUtils.assembleConditions(page, pageSize, condition);
		try {
			List<UserLog> logList = userLogService.getListByCondition(conditions);
			Boolean success = logList != null && logList.size() > 0;
			data.put("logs", logList);
			response = AssembleUtils.assembleResponse(success ? "get logs successfully" : "get log failed", success, success ? data : null);
		} catch (Exception e) {
			response = AssembleUtils.assembleResponse("get log failed caused by:" + e.getMessage(), false, null);
		}
		return response;
	}
}

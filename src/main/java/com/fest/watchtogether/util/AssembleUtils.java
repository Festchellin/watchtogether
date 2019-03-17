package com.fest.watchtogether.util;

import com.fest.watchtogether.service.IBaseService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssembleUtils {
	private AssembleUtils() {
	}
	
	public static Map<String, Object> assembleResponse(String message, Boolean success, Map<String, Object> data) {
		Map<String, Object> response = new HashMap<>();
		response.put("message", message);
		response.put("success", success);
		if (null != data) {
			if (data.size() >= 1) {
				response.put("data", data);
			}
		}
		return response;
	}
	
	public static Map<String, Object> assembleConditions(Integer currentPage, Integer pageSize, Condition condition) {
		Map<String, Object> conditions = new HashMap<>();
		conditions.put("page", currentPage);
		conditions.put("pageSize", pageSize);
		if (null != condition) {
			conditions.put(condition.getConditionName(), condition.getConditionValue());
		}
		return conditions;
	}
	
	public static Map<String, Object> assembleListResponse(Map<String, Object> response,
	                                                       Condition condition,
	                                                       Integer page,
	                                                       Integer pageSize,
	                                                       String dataKey,
	                                                       IBaseService service) {
		response.clear();
		Map<String, Object> data = new HashMap<>();
		Map<String, Object> conditions = AssembleUtils.assembleConditions(page, pageSize, condition);
		try {
			List list = service.getListByCondition(conditions);
			data.put(dataKey, list);
			if (list != null && list.size() > 0) {
				response = AssembleUtils.assembleResponse("get information successfully", true, data);
			} else {
				response = AssembleUtils.assembleResponse("no result found by conditions you gave", false, null);
			}
		} catch (Exception e) {
			response = assembleResponse("no result found by condition you gave caused by:" + e.getMessage(), false, null);
		}
		return response;
	}
	
}

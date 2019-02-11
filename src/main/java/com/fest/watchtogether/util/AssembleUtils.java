package com.fest.watchtogether.util;

import com.fest.watchtogether.entity.User;
import com.fest.watchtogether.service.IBaseService;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName AssembleUtils
 * @Description 组装类，用于组装数据
 * @Author Festchellin
 * @Date 1/1/2019  9:24 AM
 * @Version 1.0
 */
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
		List list = service.getListByCondition(conditions);
		data.put(dataKey, list);
		if (list != null && list.size() > 0) {
			response = AssembleUtils.assembleResponse("get information successfully", true, data);
		} else {
			response = AssembleUtils.assembleResponse("no result found by conditions you gave", false, null);
		}
		return response;
	}
	
	@Test
	public void testAssembleResponse() {
		Map<String, Object> data = new HashMap<>();
		data.put("user", new User());
		Map<String, Object> response = assembleResponse("OK", true, data);
		response.forEach((key, value) -> System.out.println(key + ":" + value));
	}
}

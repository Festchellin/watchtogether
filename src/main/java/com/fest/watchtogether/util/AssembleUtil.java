package com.fest.watchtogether.util;

import com.fest.watchtogether.entity.User;
import org.junit.jupiter.api.Test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName AssembleUtil
 * @Description 组装类，用于组装数据
 * @Author Festchellin
 * @Date 1/1/2019  9:24 AM
 * @Version 1.0
 */
public class AssembleUtil {
	private AssembleUtil() {
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
	
	public static Map<String, Object> assembleConditions(Integer currentPage, Integer pageSize, List<Condition> otherConditions) {
		Map<String, Object> conditions = new HashMap<>();
		conditions.put("page", currentPage);
		conditions.put("pageSize", pageSize);
		if (null != otherConditions) {
			if (otherConditions.size() >= 1) {
				for (Condition otherCondition : otherConditions) {
					conditions.put(otherCondition.getConditionName(), otherCondition.getConditionValue());
				}
			}
		}
		return conditions;
	}
	
	@Test
	public void testAssembleConditions() {
		List<Condition> conditionList = new ArrayList<>();
		Condition condition = new Condition();
		Condition condition2 = new Condition();
		condition.setConditionName("name");
		condition.setConditionValue("zhangsan");
		conditionList.add(condition);
		condition2.setConditionName("age");
		condition2.setConditionValue(18);
		conditionList.add(condition2);
		Map<String, Object> conditions = assembleConditions(1, 5, conditionList);
		conditions.forEach((conditionName, conditionValue) -> System.out.println(conditionName + ":" + conditionValue.toString()));
	}
	
	@Test
	public void testAssembleResponse() {
		Map<String, Object> data = new HashMap<>();
		data.put("user", new User());
		Map<String, Object> response = assembleResponse("OK", true, data);
		response.forEach((key, value) -> System.out.println(key + ":" + value));
	}
	
	public static class Condition implements Serializable {
		private String conditionName;
		private Object conditionValue;
		
		public String getConditionName() {
			return conditionName;
		}
		
		public void setConditionName(String conditionName) {
			this.conditionName = conditionName;
		}
		
		public Object getConditionValue() {
			return conditionValue;
		}
		
		public void setConditionValue(Object conditionValue) {
			this.conditionValue = conditionValue;
		}
		
		@Override
		public String toString() {
			return "Condition{" +
					"conditionName='" + conditionName + '\'' +
					", conditionValue='" + conditionValue + '\'' +
					'}';
		}
		
	}
}

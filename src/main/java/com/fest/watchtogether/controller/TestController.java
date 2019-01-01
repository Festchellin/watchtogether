package com.fest.watchtogether.controller;

import com.fest.watchtogether.service.IUserService;
import com.fest.watchtogether.util.AssembleUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName TestController
 * @Description
 * @Author Festchellin
 * @Date 12/31/2018  11:19 AM
 * @Version 1.0
 */
@RestController
public class TestController {
	@Autowired
	private IUserService userService;
	@GetMapping("/")
	public Object index() {
		List<AssembleUtil.Condition> otherConditionList = new ArrayList<>();
		AssembleUtil.Condition condition = new AssembleUtil.Condition();
		condition.setConditionName("account");
		condition.setConditionValue("asd");
		otherConditionList.add(condition);
		Map<String, Object> conditions = AssembleUtil.assembleConditions(0, 5, otherConditionList);
		List userList = userService.getListByCondition(conditions);
		userList.forEach(user -> System.out.println(user) );
		return "index";
	}
}

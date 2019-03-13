package com.fest.watchtogether.controller;

import com.fest.watchtogether.entity.User;
import com.fest.watchtogether.entity.UserInfo;
import com.fest.watchtogether.service.IBaseService;
import com.fest.watchtogether.util.AssembleUtils;
import com.fest.watchtogether.util.Condition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/userInfo")
public class UserInfoController extends BaseController<UserInfo> {
	@Autowired
	public UserInfoController(IBaseService<UserInfo> baseService) {
		super(baseService);
	}
	
	@Override
	@GetMapping("{id}")
	public Object getById(@PathVariable Long id) {
		Map<String, Object> response;
		Map<String, Object> data = new HashMap<>();
		UserInfo userInfo = new UserInfo();
		User user = new User();
		user.setId(id);
		userInfo.setUser(user);
		try {
			UserInfo info = baseService.getById(userInfo);
			System.out.println(info);
			Boolean success = info != null && info.getId() != null;
			data.put("info", info);
			response = AssembleUtils.assembleResponse(success ? "get date successfully" : "do not get date", success, success ? data : null);
		} catch (Exception e) {
			response = AssembleUtils.assembleResponse("do not get date caused by:" + e.getMessage(), false, null);
		}
		return response;
	}
	
	@Override
	@PostMapping
	public Object save(@RequestBody UserInfo instance) {
		instance.setLastModifyTime(new Date(System.currentTimeMillis()));
		instance.setRegisterDate(new Date(System.currentTimeMillis()));
		System.out.println(instance);
		return super.save(instance);
	}
	
	@Override
	@DeleteMapping("{id}")
	public Object deleteById(@PathVariable Long id) {
		return super.deleteById(id);
	}
	
	@Override
	@PutMapping
	public Object update(@RequestBody UserInfo instance) {
		instance.setLastModifyTime(new Date(System.currentTimeMillis()));
		return super.update(instance);
	}
	
	@Override
	@GetMapping
	public Object getListByConditions(Condition condition, Integer page, Integer pageSize) {
		return super.getListByConditions(condition, page, pageSize);
	}
}

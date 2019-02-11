package com.fest.watchtogether.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.fest.watchtogether.entity.User;
import com.fest.watchtogether.entity.UserLog;
import com.fest.watchtogether.service.IUserLogService;
import com.fest.watchtogether.service.IUserService;
import com.fest.watchtogether.util.AssembleUtils;
import com.fest.watchtogether.util.Condition;
import com.fest.watchtogether.util.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController implements Serializable, IBaseController<User> {
	private final IUserService userService;
	private final IUserLogService userLogService;
	
	private Map<String, Object> response = new HashMap<>();
	
	@Autowired
	public UserController(IUserService userService, IUserLogService userLogService) {
		this.userService = userService;
		this.userLogService = userLogService;
	}
	
	@Override
	@PostMapping("/signUp")
	public Object save(@RequestBody User user) {
		response.clear();
		Boolean userSaved = userService.save(user);
		if (userSaved) {
			user = userService.getByAccountAndPassword(user.getAccount(), user.getPassword());
			UserLog userLog = assembleUserLog(user);
			Boolean userLogSaved = userLogService.save(userLog);
			if (userLogSaved) {
				response = AssembleUtils
						.assembleResponse("User  sign up successfully!", true,
								assembleUserAndToken(user, userLog.getUserToken()));
			} else {
				response = AssembleUtils.assembleResponse("user sign up successfully, but sign in failed", false, null);
			}
		} else {
			response = AssembleUtils.assembleResponse("user sign up failed", false, null);
		}
		return response;
	}
	
	@Override
	public Object deleteById(Long id) {
		return null;
	}
	
	@PostMapping("/signIn")
	public Object signIn(@RequestBody User user) {
		response.clear();
		try {
			user = userService.getByAccountAndPassword(user.getAccount(), user.getPassword());
			UserLog userLog = assembleUserLog(user);
			Boolean isSignIn = userLogService.save(userLog);
			if (isSignIn) {
				response = AssembleUtils
						.assembleResponse("User sign In successfully!", true,
								assembleUserAndToken(user, userLog.getUserToken()));
			} else {
				response = AssembleUtils
						.assembleResponse("Account or Password is wrong,we can't find such user!", false, null);
			}
		} catch (Exception e) {
			response = AssembleUtils
					.assembleResponse("Account or Password is wrong,we can't find such user!!", false, null);
		}
		return response;
	}
	
	@PostMapping("/signInWithToken")
	public Object signInWithToken(String userToken) {
		response.clear();
		try {
			DecodedJWT decodedJWT = JWTUtils.verifyToken(userToken);
			decodedJWT.getClaims().forEach((name, value) -> System.out.println(name + ":" + value));
			UserLog userLog = userLogService.getUserLogByUserToken(userToken);
			User user = userLog.getUser();
			response = AssembleUtils.assembleResponse("User sign in successfully", true,
					assembleUserAndToken(user, userToken));
		} catch (Exception e) {
			response = AssembleUtils.assembleResponse(e.getMessage(), false, null);
		}
		return response;
	}
	
	@Override
	@PutMapping
	public Object update(User instance) {
		response.clear();
		Boolean updated = userService.update(instance);
		if (updated) {
			instance = userService.getById(instance);
			UserLog userLog = userLogService.getLatestLogByUser(instance.getId());
			response = AssembleUtils.assembleResponse("update successfully", true,
					assembleUserAndToken(instance, userLog.getUserToken())
			);
		} else {
			response = AssembleUtils.assembleResponse("update faild", false, null);
		}
		return response;
	}
	
	@Override
	@GetMapping("/{id}")
	public Object getById(@PathVariable Long id) {
		response.clear();
		User user = new User();
		user.setId(id);
		user = userService.getById(user);
		if (user != null) {
			Map<String, Object> data = new HashMap<>();
			UserLog userLog = userLogService.getLatestLogByUser(user.getId());
			data.put("user", user);
			data.put("userLog", userLog);
			response = AssembleUtils.assembleResponse("get user successfully", true, data);
		} else {
			response = AssembleUtils.assembleResponse("no such user", false, null);
		}
		return response;
	}
	
	@Override
	@GetMapping
	public Object getListByConditions(Condition condition,
	                                  @RequestParam(defaultValue = "0") Integer page,
	                                  @RequestParam(defaultValue = "5") Integer pageSize) {
		return AssembleUtils.assembleListResponse(response, condition, page - 1 >= 0 ? page - 1 : 0, pageSize, "userList", userService);
	}
	
	private UserLog assembleUserLog(User user) {
		String userToken = JWTUtils.generateUserToken(user);
		UserLog userLog = new UserLog();
		userLog.setUser(user);
		userLog.setLoginTime(new Date(System.currentTimeMillis()));
		userLog.setUserToken(userToken);
		return userLog;
	}
	
	private Map<String, Object> assembleUserAndToken(User user, String userToken) {
		Map<String, Object> data = new HashMap<>();
		data.put("user", user);
		data.put("userToken", userToken);
		return data;
	}
}

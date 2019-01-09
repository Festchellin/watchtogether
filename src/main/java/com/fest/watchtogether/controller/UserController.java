package com.fest.watchtogether.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.fest.watchtogether.entity.User;
import com.fest.watchtogether.entity.UserLog;
import com.fest.watchtogether.service.IUserLogService;
import com.fest.watchtogether.service.IUserService;
import com.fest.watchtogether.util.AssembleUtil;
import com.fest.watchtogether.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Festchellin
 * @version 1.0
 * @description
 * @date 1/1/2019  2:18 PM
 */
@RestController
@RequestMapping("/user")
public class UserController implements Serializable {
	private final IUserService userService;
	private final IUserLogService userLogService;
	
	private Map<String, Object> response = new HashMap<>();
	
	@Autowired
	public UserController(IUserService userService, IUserLogService userLogService) {
		this.userService = userService;
		this.userLogService = userLogService;
	}
	
	/**
	 * @return java.lang.Object
	 * @author Festchellin
	 * @email festchellinme@gmail.com
	 * @description user sign up required name account and password fields.
	 * @date 2:23 PM 1/2/2019
	 * @Param [user]
	 */
	@PostMapping("/signUp")
	public Object save(User user) {
		response.clear();
		Boolean userSaved = userService.save(user);
		if (userSaved) {
			user = userService.getByAccountAndPassword(user.getAccount(), user.getPassword());
			UserLog userLog = assembleUserLog(user);
			Boolean userLogSaved = userLogService.save(userLog);
			if (userLogSaved) {
				response = AssembleUtil
						.assembleResponse("User  sign up successfully!", true,
								assembleUserAndToken(user, userLog.getUserToken()));
			} else {
				response = AssembleUtil.assembleResponse("user sign up successfully, but sign in failed", false, null);
			}
		} else {
			response = AssembleUtil.assembleResponse("user sign up failed", false, null);
		}
		return response;
	}
	
	/**
	 * @return java.lang.Object
	 * @author Festchellin
	 * @email festchellinme@gmail.com
	 * @description user sign in with account and password.
	 * @date 2:24 PM 1/2/2019
	 * @Param [user]
	 */
	@PostMapping("/signIn")
	public Object signIn(User user) {
		response.clear();
		user = userService.getByAccountAndPassword(user.getAccount(), user.getPassword());
		UserLog userLog = assembleUserLog(user);
		Boolean isSignIn = userLogService.save(userLog);
		if (isSignIn) {
			response = AssembleUtil
					.assembleResponse("User sign In successfully!", true,
							assembleUserAndToken(user, userLog.getUserToken()));
		}
		return response;
	}
	
	/**
	 * @return java.lang.Object
	 * @author Festchellin
	 * @email festchellinme@gmail.com
	 * @description user sign in with userToken
	 * @date 2:25 PM 1/2/2019
	 * @Param [userToken]
	 */
	@PostMapping("/signInWithToken")
	public Object signInWithToken(String userToken) {
		response.clear();
		try {
			DecodedJWT decodedJWT = JWTUtil.verifyToken(userToken);
			decodedJWT.getClaims().forEach((name, value) -> System.out.println(name + ":" + value));
			UserLog userLog = userLogService.getUserLogByUserToken(userToken);
			User user = userLog.getUser();
			response = AssembleUtil.assembleResponse("User sign in successfully", true,
					assembleUserAndToken(user, userToken));
		} catch (Exception e) {
			response = AssembleUtil.assembleResponse(e.getMessage(), false, null);
		}
		return response;
	}
	
	/**
	 * @return java.lang.Object
	 * @author Festchellin
	 * @email festchellinme@gmail.com
	 * @description Get the user object based on its's
	 * @date 3:02 PM 1/2/2019
	 * @Param [id]
	 */
	@GetMapping("/{id}")
	public Object getById(@PathVariable Long id) {
		response.clear();
		User user = new User();
		user.setId(id);
		user = userService.getById(user);
		if (user != null) {
			Map<String,Object> data = new HashMap<>();
			UserLog userLog = userLogService.getLatestLogByUser(user.getId());
			data.put("user", user);
			data.put("userLog", userLog);
			response = AssembleUtil.assembleResponse("get user successfully", true, data);
		} else {
			response = AssembleUtil.assembleResponse("no such user", false, null);
		}
		return response;
	}
	
	/**
	 * @author Festchellin
	 * @email festchellinme@gmail.com
	 * @description update user information [name, password, adminRole]
	 * @date 3:53 PM 1/2/2019
	 * @Param [user]
	 * @return java.lang.Object
	 */
	@PutMapping
	public Object update(User user) {
		response.clear();
		Boolean updated = userService.update(user);
		if (updated) {
			user = userService.getById(user);
			UserLog userLog = userLogService.getLatestLogByUser(user.getId());
			response = AssembleUtil.assembleResponse("update successfully", true,
					assembleUserAndToken(user, userLog.getUserToken())
			);
		} else {
			response = AssembleUtil.assembleResponse("update faild", false, null);
		}
		return response;
	}
	
	/**
	 * @author Festchellin
	 * @email festchellinme@gmail.com
	 * @description get the user information list according to the conditions without password
	 * @date 3:55 PM 1/2/2019
	 * @Param [conditionList, page, pageSize]
	 * @return java.lang.Object
	 */
	@GetMapping
	public Object getListByCondition(List<AssembleUtil.Condition> conditionList,
	                                 @RequestParam(defaultValue = "0") Integer page,
	                                 @RequestParam(defaultValue = "5") Integer pageSize) {
		response.clear();
		Map<String, Object> conditions = AssembleUtil.assembleConditions(page, pageSize, conditionList);
		List<User> userList = userService.getListByCondition(conditions);
		Map<String, Object> data = new HashMap<>();
		data.put("userList", userList);
		if (userList != null && userList.size() > 0) {
			response = AssembleUtil.assembleResponse("get information successfully", true, data);
		} else {
			response = AssembleUtil.assembleResponse("no result found by conditions you gave", false, null);
		}
		return response;
	}
	
	/**
	 * @return com.fest.watchtogether.entity.UserLog
	 * @author Festchellin
	 * @email festchellinme@gmail.com
	 * @description assemble a new userLog infomation with user (required account)
	 * @date 2:26 PM 1/2/2019
	 * @Param [user]
	 */
	private UserLog assembleUserLog(User user) {
		String userToken = JWTUtil.generateUserToken(user);
		UserLog userLog = new UserLog();
		userLog.setUser(user);
		userLog.setLoginTime(new Date(System.currentTimeMillis()));
		userLog.setUserToken(userToken);
		return userLog;
	}
	
	/**
	 * @return java.util.Map<java.lang.String , java.lang.Object>
	 * @author Festchellin
	 * @email festchellinme@gmail.com
	 * @description assemble the infomation if user sign in successfully.
	 * include the user infomation and userToken for next time sign in
	 * @date 2:27 PM 1/2/2019
	 * @Param [user, userToken]
	 */
	private Map<String, Object> assembleUserAndToken(User user, String userToken) {
		Map<String, Object> data = new HashMap<>();
		data.put("user", user);
		data.put("userToken", userToken);
		return data;
	}
}

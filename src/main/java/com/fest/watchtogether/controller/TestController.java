package com.fest.watchtogether.controller;

import com.fest.watchtogether.entity.User;
import com.fest.watchtogether.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	private final IUserService userService;
	
	
	@Autowired
	public TestController(IUserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/")
	public Object index() {
		System.out.println("Index");
		User user = new User();
		user.setId(1L);
		user.setAccount("userInMongoDb");
		user.setPassword("123123");
		user.setAdminRole(false);
		user.setName("zs");
//		userRepository.save(user);
//		List<User> users = userRepository.findAll();
//		users.forEach(System.out::println);
		return user;
	}
	
}

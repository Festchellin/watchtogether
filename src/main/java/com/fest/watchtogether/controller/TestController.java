package com.fest.watchtogether.controller;

import com.fest.watchtogether.dao.UserRepositoryMongo;
import com.fest.watchtogether.entity.User;
import com.fest.watchtogether.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
	private final IUserService userService;
	private final UserRepositoryMongo userRepository;
	private final GridFsTemplate gridFsTemplate;
	@Resource
	private MongoDbFactory mongoDbFactory;
	
	@Autowired
	public TestController(IUserService userService, UserRepositoryMongo userRepository, GridFsTemplate gridFsTemplate) {
		this.userService = userService;
		this.userRepository = userRepository;
		this.gridFsTemplate = gridFsTemplate;
	}
	
	@GetMapping("/")
	public Object index() {
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

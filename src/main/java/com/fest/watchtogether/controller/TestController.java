package com.fest.watchtogether.controller;

import com.fest.watchtogether.entity.User;
import com.fest.watchtogether.service.IUserService;
import com.fest.watchtogether.thread.FFMPEGConvertorThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/test")
public class TestController {
	private final IUserService userService;
	
	
	@Autowired
	public TestController(IUserService userService) {
		this.userService = userService;
	}
	
	@GetMapping
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
	
	@GetMapping("/file")
	public Object file() throws ExecutionException, InterruptedException {
		File file = new File("F:\\Videos\\Mine\\haiwang.mkv");
		new Thread(new FFMPEGConvertorThread(file, null)).start();
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
//		FFMPEGConvertorCallable convertorCallable = new FFMPEGConvertorCallable(file, null);
//		Future<Boolean> submit = executorService.submit(convertorCallable);
//		Boolean success = submit.get();
//		executorService.shutdown();
		return "OK";
	}
}

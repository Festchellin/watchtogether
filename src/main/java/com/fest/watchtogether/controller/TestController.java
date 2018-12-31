package com.fest.watchtogether.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description
 * @Author Festchellin
 * @Date 12/31/2018  11:19 AM
 * @Version 1.0
 */
@RestController
public class TestController {
	@GetMapping("/")
	public Object index(){
		return "index";
	}
}

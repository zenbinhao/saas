package com.zeng.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class Hello02Controller {

	@Autowired
	HelloFeignClient helloFeignClient;
	
	@GetMapping("get")
	public String name() {
		String name = helloFeignClient.name();
		System.out.println("----------------name---" + name);
		return "client02" +"-----"+ name;
	}
}

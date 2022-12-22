package com.zeng.auth.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1")
public class HelloController {

	@GetMapping("get")
	public String name() {
		return "client01";
	}
	
	@PostMapping("post")
	public String postName() {
		return "client01";
	}
}

package com.zeng.blog.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "auth")
public interface HelloFeignClient {

	@GetMapping("v1/get")
	String name();
}

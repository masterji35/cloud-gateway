package com.dailycodebuffer.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	@GetMapping("userServiceFallBack")
	public String userServiceFallBackMethod() {
		return "User Service istaking longer than expected! " +
	" Please try again later !";
	}
	
	@GetMapping("departmentServiceFallBack")
	public String departmentServiceFallBackMethod() {
		return "Department Service istaking longer than expected! " +
	" Please try again later !";
	}

}

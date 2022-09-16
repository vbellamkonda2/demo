package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Welcome to Demo";
	}
	
	@GetMapping("/hi")
	public String sayHi() {
		return "Welcome to Phase2";
	}
}

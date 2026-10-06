package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping(value="/")
	public String sayHello() {
		return "Welcome to Spring Boot..";
	}
	
	@GetMapping(value="/greeting")
	public String greeting() {
		return "Good Morning Prasanna...";
	}
	
	@GetMapping(value="/topic")
	public String topic() {
		return "Spring Boot Topic Going on...";
	}
}

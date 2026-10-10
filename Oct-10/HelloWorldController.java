package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

	@RequestMapping("/")
	public Hello helloWorldBean()  
	{  
		return new Hello("Welcome to Spring Boot Beans"); //constructor of HelloWorldBean  
	}  
	@RequestMapping("/empall") 
	public Employ[] showEmploy() {
		Employ[] arrEmp = new Employ[] {
			new Employ(1, "Aryan", 88234),
			new Employ(3, "Gowri",882355),
			new Employ(4, "Naresh",88123)
		};
		return arrEmp;
	}
	
	@RequestMapping("/showall")
	public Hello[] showAll() {
		Hello[] arr = new Hello[] {
			new Hello("Good Morning"),
			new Hello("Good Evening"),
			new Hello("SpringBoot Good ONe")
		};
		return arr;
	}
}

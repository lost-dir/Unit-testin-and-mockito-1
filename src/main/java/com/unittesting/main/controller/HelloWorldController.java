package com.unittesting.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/greeting")
	public String helloWorld() {
		return "Hello world";
	}
}

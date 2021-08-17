package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	@GetMapping("/")
	public String getHello() {
		return "Hello User";
	}
	@GetMapping("/error")
	public String getErrorMessage() {
		return "Error has been occured.";
	}

}

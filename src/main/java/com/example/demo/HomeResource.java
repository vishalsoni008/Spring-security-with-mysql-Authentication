package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@GetMapping("/")
	public String Home() {
		return "welcome home";
	}
	@GetMapping("/user")
	public String User() {
		return "Welcome user";
	}
	@GetMapping("/admin")
	public String Admin() {
		return "welcome Admin";
	}
	
}

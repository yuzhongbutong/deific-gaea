package com.deific.gaea.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHelloWorld {

	@GetMapping("/hello")
	public String getHello(@RequestParam(required = false) String name) {
		System.out.println("/////////////////////");
		if (name == null) {
			name = "James";
		}
		return "Hello, " + name;
	}
}

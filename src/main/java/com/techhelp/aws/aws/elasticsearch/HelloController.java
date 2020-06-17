package com.techhelp.aws.aws.elasticsearch;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {
	
	@GetMapping
	public String hellow() {
		return "Hello world";
	}
}

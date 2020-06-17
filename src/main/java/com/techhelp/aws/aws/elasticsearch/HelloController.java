package com.techhelp.aws.aws.elasticsearch;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {
	
	public String hellow() {
		return "Hello world";
	}
}


 package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
//@Controller
//@ResponseBody
public class HelloWorldController {
// http GET Request
	//http://localhost:8080/hello
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "hello World";
	}
	
	
}

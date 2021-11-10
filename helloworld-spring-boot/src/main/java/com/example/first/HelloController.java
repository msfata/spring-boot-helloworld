package com.example.first;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//	@GetMapping("/")
//	Accessible in http://localhost:8080/
//	@GetMapping
//	Accessible in http://localhost:8080/

//	@GetMapping("/index")
//	Accessible in http://localhost:8080/index
	public String index() {
		return "HelloWorld!";
	}
}
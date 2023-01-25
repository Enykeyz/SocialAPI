package com.ernestspringboot.demo;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping(value="/welcome")
	public static String welcome() {
		return "Hello guys! Welcome to spring boot";
	}
}

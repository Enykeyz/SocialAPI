package com.ernestspringboot.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import user.User;

@RestController
public class UserController {

	@Autowired 
	private UserService userService;
	
	@GetMapping(value="/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping(value="/users/{id}")
	public User getUser(@PathVariable String id) {
		return userService.getUser(id);
	}
} 

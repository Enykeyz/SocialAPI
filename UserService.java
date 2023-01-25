package com.ernestspringboot.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import location.Location;
import user.User;

@Service
public class UserService {

	User user1 = new User(
			"u1",
			"David",
			"Lawson",
			new Location("11", "29, Saeed Ahmed Block, Lagos"),
			"david80@gmail.com");
	
	User user2 = new User(
			"u2",
			"Blessed",
			"Carl",
			new Location("22", "Benson Brown Close"),
			"blessed4carl@gmail.com");
	
	private List<User> users = Arrays.asList(user1, user2);
	
	public List<User> getAllUsers(){ 
		return users; 
		
	}
	
	public User getUser(String id) {
		User user = users.stream()
				.filter(t -> id.equals(t.getId()))
				.findFirst()
				.orElse(null);
		
		return user;
				
	}
}

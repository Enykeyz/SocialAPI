package com.ernestspringboot.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import location.Location;
import post.Post;
import user.User;

@Service
public class PostService {
	
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
	
	Post post1 = new Post(
			"p1",
			"01-Jan-23",
			user1,
			"its good to love and be loved");
	
	Post post2 = new Post(
			"p2",
			"15-Jan-23",
			user2,
			"I love pizza");
	
	List<Post> posts = Arrays.asList(post1, post2);
	
	public List<Post> getAllPosts(){
		
		return posts;
	}
	
	public Post getPost(String id) {
		Post post = posts.stream()
				.filter(p -> id.equals(p.getId()))
				.findFirst()
				.orElse(null);
		
		return post;
	}

}

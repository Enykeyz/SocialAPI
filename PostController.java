package com.ernestspringboot.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import location.Location;
import post.Post;
import user.User;

@RestController
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@GetMapping(value="/posts")
	public List<Post> getAllPosts() {
		return postService.getAllPosts();
	}

	@GetMapping(value = "/posts/{id}")
	public Post getPost(@PathVariable String id) {
		return postService.getPost(id);
	}
}

package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	public UserService userservice;
	
	@GetMapping("/details")
	public List<User> getAllUsers(){
		return userservice.getAllUsers();
	}
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		return userservice.createUser(user);
	}
	
	 @GetMapping("/{id}")
	    public Optional<User> getUserById(@PathVariable Long id) {
	        return userservice.getUserById(id);
	    }

	    @PutMapping("/{id}")
	    public User updateUser(@PathVariable Long id, @RequestBody User user) {
	        return userservice.updateUser(id, user);
	    }

}

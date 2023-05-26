package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.Service.UserService;
import com.amdocs.model.User;

@RestController
public class UserController {

	// inject the userservice
	@Autowired
	private UserService userService;

	@PostMapping("/saveuser")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		User user2 = userService.saveUser(user);
		return ResponseEntity.ok().body(user2);
	}

}

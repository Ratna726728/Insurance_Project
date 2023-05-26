package com.amdocs.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.model.User;
import com.amdocs.service.UserService;

@RestController
public class UserController {

	// inject the userservice

	@Autowired
	private UserService userService;

	@GetMapping("/fetchuser/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) {
		User user = userService.getUserById(id);
		return ResponseEntity.ok().body(user);
	}
}
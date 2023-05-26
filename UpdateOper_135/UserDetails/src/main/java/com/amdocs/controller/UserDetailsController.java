package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.model.UserDetails;
import com.amdocs.service.UserDetailsService;

@RestController
public class UserDetailsController {

	@Autowired
	private UserDetailsService userDetailsService;

	// Update operation
	@PutMapping("/update/{id}")

	public UserDetails updateUserDetails(@RequestBody UserDetails userDetails, @PathVariable("id") Long id) {

		return userDetailsService.updateUserDetails(userDetails, id);
	}

}

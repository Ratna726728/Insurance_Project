package com.amdocs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.model.User;
import com.amdocs.repository.UserRepository;
import com.amdocs.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	// inject the userrepository reference
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User getUserById(Integer id) {
		User user = userRepository.findById(id);
		return user;
	}

}

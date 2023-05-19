package com.amdocs.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.Service.UserService;
import com.amdocs.model.User;
import com.amdocs.repository.UserRepository;

@Service
public class UserserviceImpl implements UserService {

	// inject Userrepository
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		User user1= userRepository.save(user);
		return user1;
	}

}

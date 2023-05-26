package com.amdocs.serviceimpl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.model.UserDetails;
import com.amdocs.repository.UserDetailsRepository;
import com.amdocs.service.UserDetailsService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@Override
	public UserDetails updateUserDetails(UserDetails userDetails, Long id) {
		UserDetails user = userDetailsRepository.findById(id).get();

		if (Objects.nonNull(userDetails.getUser_name()) && !"".equalsIgnoreCase(userDetails.getUser_name())) {
			user.setUser_name(userDetails.getUser_name());
		}

		if (Objects.nonNull(userDetails.getUser_address()) && !"".equalsIgnoreCase(userDetails.getUser_address())) {
			user.setUser_address(userDetails.getUser_address());
		}

		if (Objects.nonNull(userDetails.getPolicy_id()) && !"".equalsIgnoreCase(userDetails.getPolicy_id())) {
			user.setPolicy_id(userDetails.getPolicy_id());
		}

		if (Objects.nonNull(userDetails.getNominee_status()) && !"".equalsIgnoreCase(userDetails.getNominee_status())) {
			user.setNominee_status(userDetails.getNominee_status());
		}

		return userDetailsRepository.save(user);
	}

}

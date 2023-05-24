package com.amdocs.service;

import com.amdocs.model.UserDetails;

public interface UserDetailsService {
	// Update operation
    UserDetails updateUserDetails(UserDetails userDetails, Long id);

}

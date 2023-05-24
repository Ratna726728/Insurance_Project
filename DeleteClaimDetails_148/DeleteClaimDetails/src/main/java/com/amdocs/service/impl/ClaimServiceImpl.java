package com.amdocs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.repository.ClaimRepository;
import com.amdocs.service.ClaimService;

@RestController
public class ClaimServiceImpl implements ClaimService {

	// inject the repository reference
	@Autowired
	private ClaimRepository claimRepository;

	@Override
	public void deleteClaim(Integer Id) {
		claimRepository.deleteById(Id);

	}

}

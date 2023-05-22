
package com.amdocs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.model.AddClaim;
import com.amdocs.repository.AddClaimRepository;
import com.amdocs.service.AddClaimService;

@Service
public class AddClaimServiceImpl implements AddClaimService {

	// inject the repository reference
	@Autowired
	private AddClaimRepository addClaimRepository;

	@Override
	public AddClaim saveAddClaim(AddClaim addClaim) {
		AddClaim addClaim1 = addClaimRepository.save(addClaim);
		return addClaim1;
	}

}

package com.amdocs.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.repository.PolicyDetailsRepository;
import com.amdocs.service.PolicyDetailsService;

@Service
public class PolicyDetailsServiceImpl implements PolicyDetailsService{

	@Autowired
	private PolicyDetailsRepository policyDetailsRepository;
	
	@Override
	public void deletePolicyDetails(Integer policy_id) {
		policyDetailsRepository.deleteById(policy_id);
	}

}

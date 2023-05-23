package com.amdocs.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.model.PolicyPremium;
import com.amdocs.repository.PolicyPremiumRepository;
import com.amdocs.service.PolicyPremiumService;

@Service
public class PolicyPremiumServiceImpl implements PolicyPremiumService {

	@Autowired
	private PolicyPremiumRepository policyPremiumRepository;
	
	@Override
	public PolicyPremium getPolicyPremiumById(Integer id) {
		 
		return policyPremiumRepository.findById(id);
	}

}
 
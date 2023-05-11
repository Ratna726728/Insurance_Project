package com.amdocs.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.model.PolicyPremiumInsert;
import com.amdocs.repository.PolicyPremiumInsertRepository;
import com.amdocs.service.PolicyPremiumService;

@Service
public class PolicyPremiumServiceImpl implements PolicyPremiumService{

//	Inject repository reference
	@Autowired
	private PolicyPremiumInsertRepository policyPremiumInsertRepository;
	
	@Override
	public PolicyPremiumInsert savePolicyPremium(PolicyPremiumInsert policyPremiumInsert) {
		
		return policyPremiumInsertRepository.save(policyPremiumInsert);
	}
	

}

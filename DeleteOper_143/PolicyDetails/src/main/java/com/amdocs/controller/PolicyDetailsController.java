package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.service.PolicyDetailsService;

@RestController
public class PolicyDetailsController {
	
	@Autowired
	private PolicyDetailsService policyDetailsService;

	@DeleteMapping("/delete/{policy_id}")
	public void deletePolicyDetailsById(@PathVariable("policy_id") Integer policy_id) {
		policyDetailsService.deletePolicyDetails(policy_id);
	}
}

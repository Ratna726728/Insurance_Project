package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.model.PolicyPremium;
import com.amdocs.service.PolicyPremiumService;

@RestController
public class PolicyPremiumController {
	
	@Autowired
	private PolicyPremiumService policyPremiumService;
	
	@GetMapping("/get/{id}")
	public ResponseEntity<PolicyPremium> getPolicyPremiumById(@PathVariable("id") Integer id){
		return ResponseEntity.ok().body(policyPremiumService.getPolicyPremiumById(id));
		
	}

}

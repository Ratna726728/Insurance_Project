package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.model.PolicyPremiumInsert;
import com.amdocs.service.PolicyPremiumService;

@RestController
//@RequestMapping("/premium_info")
public class PolicyPremiumInsertController {
	
//	inject the service
	@Autowired
	private PolicyPremiumService policyPremiumService;

//	Design a restful web service to insert/Save the data into the database
	@PostMapping("/savePolicyPremiumData")
	public ResponseEntity<PolicyPremiumInsert> savePolicyPremium(@RequestBody PolicyPremiumInsert policyPremiumInsert) {
		PolicyPremiumInsert policyPreInsert = policyPremiumService.savePolicyPremium(policyPremiumInsert);
		return ResponseEntity.ok().body(policyPreInsert);
		
	}
	
}

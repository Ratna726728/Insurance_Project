package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.amdocs.model.PremiumDetails;
import com.amdocs.service.PremiumDetailsService;

@RestController

public class PremiumDetailsController {

	@Autowired
	private PremiumDetailsService premiumDetailsService;
	
	@PostMapping("/saveDetails")
	public ResponseEntity<PremiumDetails> savePremiumDetails(@RequestBody PremiumDetails premiumDetails){
		PremiumDetails premiumDetails2 = premiumDetailsService.savePremiumDetails(premiumDetails);
		return ResponseEntity.ok().body(premiumDetails2);
		
	}
	
	
}

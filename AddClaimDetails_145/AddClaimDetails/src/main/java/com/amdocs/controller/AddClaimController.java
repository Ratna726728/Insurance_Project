package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.model.AddClaim;
import com.amdocs.service.AddClaimService;

@RestController
public class AddClaimController {

	// inject the service reference
	@Autowired
	private AddClaimService addClaimService;

	@PostMapping("/addclaim")
	public ResponseEntity<AddClaim> saveAddClaim(@RequestBody AddClaim addclaim) {
		AddClaim addClaim = addClaimService.saveAddClaim(addclaim);
		return ResponseEntity.ok().body(addClaim);
	}

}

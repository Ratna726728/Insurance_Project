package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.service.ClaimService;

@RestController
public class ClaimController {

	// inject the service reference
	@Autowired
	private ClaimService claimService;

	// design rest web API
	@DeleteMapping("/deleteclaim/{id}")
	public void deleteClaimById(@PathVariable("id") Integer id) {
		claimService.deleteClaim(id);
	}
}

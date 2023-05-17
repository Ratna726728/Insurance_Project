package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.model.BranchDetails;
import com.amdocs.repository.BranchDetailsRepository;
import com.amdocs.service.BranchDetailsService;

@RestController

public class BranchDetailsController {
	
	@Autowired
	private BranchDetailsService branchDetailsService;
	
	@Autowired
	private BranchDetailsRepository branchDetailsRepository;
	
	@PutMapping("/updateBranchDetails/{id}")
	public ResponseEntity<BranchDetails> getBranchDetailsById(@PathVariable("id") Integer id,
			@RequestBody BranchDetails branchDetails){
		
		BranchDetails branchDetails1 = branchDetailsService.getBranchDetailsById(id);
		
		branchDetails1.setBranch_name(branchDetails.getBranch_name());
		branchDetails1.setBranch_Address(branchDetails.getBranch_Address());
		branchDetails1.setBranch_code(branchDetails.getBranch_code());
		branchDetails1.setBranch_ifsc(branchDetails.getBranch_ifsc());
		branchDetails1.setBranch_city(branchDetails.getBranch_city());
		branchDetails1.setBranch_state(branchDetails.getBranch_state());
		branchDetails1.setBranch_country(branchDetails.getBranch_country());
		branchDetails1.setBranch_zipcode(branchDetails.getBranch_zipcode());
		
		BranchDetails branchDetails2 = branchDetailsRepository.save(branchDetails1);
		
		return ResponseEntity.ok().body(branchDetails2);
		
	}
	

	

}

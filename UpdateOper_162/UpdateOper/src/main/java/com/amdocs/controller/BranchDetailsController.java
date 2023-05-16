package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.model.BranchDetails;
import com.amdocs.service.BranchDetailsService;

@RestController
public class BranchDetailsController {
	
	@Autowired
	private BranchDetailsService branchDetailsService;
	
	@PutMapping("/updateDetails")
	public ResponseEntity<BranchDetails> updateBranchDetails(@RequestBody BranchDetails branchDetails){
	
		
		BranchDetails updatedetails = branchDetailsService.updateBranchDetails(branchDetails);
		return ResponseEntity.ok(updatedetails);
	}
	
	

}

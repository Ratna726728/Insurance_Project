package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.amdocs.model.BranchDetails;

import com.amdocs.service.BranchDetailsService;

@RestController

public class BranchDetailsController {
	
	@Autowired
	private BranchDetailsService branchDetailsService;
		
	// Update operation
    @PutMapping("/departments/{id}")
 
    public BranchDetails updateBranchDetails(@RequestBody BranchDetails branchDetails, @PathVariable("id") Long id) {
        
    	return branchDetailsService.updateBranchDetails(branchDetails, id);
    }
	

	

}

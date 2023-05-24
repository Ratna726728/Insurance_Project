package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.model.ClaimDetails;
import com.amdocs.service.ClaimDetailsService;

@RestController
public class ClaimDetailsController {
	
	@Autowired
	private ClaimDetailsService claimDetailsService;
		
	// Update operation
    @PutMapping("/departments/{id}")
 
    public ClaimDetails updateClaimDetails(@RequestBody ClaimDetails claimDetails, @PathVariable("id") Long id) {
        
    	return claimDetailsService.updateClaimDetails(claimDetails, id);
    }
	

}

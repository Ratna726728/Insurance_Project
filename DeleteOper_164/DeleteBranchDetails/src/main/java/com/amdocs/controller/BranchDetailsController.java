package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.service.BranchDetailsService;

@RestController
public class BranchDetailsController {
	
	@Autowired
	private BranchDetailsService branchDetailsService;
	
	@DeleteMapping("/delete/{id}")
	public void deleteBranchDetailsById(@PathVariable("id") Long id) {
		branchDetailsService.deleteBranchDetails(id);
	}

}

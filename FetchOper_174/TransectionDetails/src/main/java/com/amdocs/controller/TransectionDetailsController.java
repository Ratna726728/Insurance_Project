package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.model.TransectionDetails;
import com.amdocs.service.TransectionDetailsService;

@RestController
public class TransectionDetailsController {
	
	/*
	 * Injecting service here
	 */
	@Autowired
	private TransectionDetailsService transectionDetailsService;
	
	/*
	 * Get mapping to get the transection details
	 */
	@GetMapping("/get/{id}")
	public ResponseEntity<TransectionDetails> getTransectionDetailsById(@PathVariable("id") Integer id){
	
		return ResponseEntity.ok().body(transectionDetailsService.getTransectionDetailsById(id));
		
	}
	

}

package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.model.NomineeDetails;
import com.amdocs.service.NomineeDetailsService;

@RestController
public class NomineeDetailsController {
	
	@Autowired
	private NomineeDetailsService nomineeDetailsService;
	
	@GetMapping("/get/{id}")
	public ResponseEntity<NomineeDetails> getNomineeDetails(@PathVariable("id") Integer id){
		
		NomineeDetails nd = nomineeDetailsService.getNomineeDetailsById(id);
		
		return ResponseEntity.ok().body(nd);
		
	}

}

package com.amdocs.controller;

import java.util.List;

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
	
	@GetMapping("/get/{nominee_name}")
	public ResponseEntity<List<NomineeDetails>> getNomineeDetailsByName(@PathVariable("nominee_name") String nominee_name){
		
		List<NomineeDetails> nomineeDetails1=nomineeDetailsService.getListByName(nominee_name);
		
		return ResponseEntity.ok().body(nomineeDetails1);
		
	}

}

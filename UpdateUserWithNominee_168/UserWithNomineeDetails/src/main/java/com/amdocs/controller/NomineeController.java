package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.model.Nominee;
import com.amdocs.service.NomineeService;

@RestController
public class NomineeController {

	// inject the service reference
	@Autowired
	private NomineeService NomineeService;

	public ResponseEntity<Nominee> updateNominee(@RequestBody Nominee nominee) {
		Nominee nominee2 = NomineeService.updateNominee(nominee);
		return ResponseEntity.ok().body(nominee);
	}

}

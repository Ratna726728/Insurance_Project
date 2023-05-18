package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.amdocs.model.PolicySchedule;
import com.amdocs.service.PolicyScheduleService;

@RestController
public class PolicyScheduleController {

	// inject the Service reference
	@Autowired
	private PolicyScheduleService policyScheduleService;

	@PostMapping("/addpolicy")
	public ResponseEntity<PolicySchedule> savePolicySchedule(@RequestBody PolicySchedule policySchedule) {
		PolicySchedule policySchedule2 = policyScheduleService.savePolicySchedule(policySchedule);
		return ResponseEntity.ok().body(policySchedule2);
	}

}

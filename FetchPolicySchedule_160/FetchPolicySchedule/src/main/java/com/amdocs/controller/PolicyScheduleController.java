package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.model.PolicySchedule;
import com.amdocs.service.PolicyScheduleService;

@RestController
public class PolicyScheduleController {

	// inject the policyscheduleservice refereence
	@Autowired
	private PolicyScheduleService policyScheduleService;

	@GetMapping("/fetchpolicyschedule/{id}")
	public ResponseEntity<PolicySchedule> getPolicyScheduleById(@PathVariable("id") Integer id) {
		PolicySchedule policySchedule = policyScheduleService.getPolicyScheduleById(id);
		return ResponseEntity.ok().body(policySchedule);
	}

}

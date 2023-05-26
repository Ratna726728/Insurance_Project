package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.model.PolicySchedule;
import com.amdocs.service.PolicyScheduleService;

@RestController
public class PolicyScheduleController {

	// inject the service
	@Autowired
	private PolicyScheduleService policyScheduleService;

	// design the restful web service

	@GetMapping("/fecth/{id}")
	public ResponseEntity<PolicySchedule> getpolicyScheduleById(@PathVariable("id") Integer id) {
		PolicySchedule policySchedule = policyScheduleService.getPolicyScheduleByID(id);
		return ResponseEntity.ok().body(policySchedule);
	}
  @PostMapping("/savepolicy")
	public ResponseEntity<PolicySchedule> savePolicySchedule(@RequestBody PolicySchedule policySchedule) {
		PolicySchedule policySchedule1 = policyScheduleService.savePolicySchedule(policySchedule);
		return ResponseEntity.ok().body(policySchedule);
	}

}

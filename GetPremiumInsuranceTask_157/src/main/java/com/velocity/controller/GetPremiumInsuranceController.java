package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.GetPremiumInsuranceModel;
import com.velocity.service.GetPremiumInsuranceService;

@RestController
public class GetPremiumInsuranceController {
	@Autowired
	private GetPremiumInsuranceService getPremiumInsuranceService;
@GetMapping("/fetch/{id}")
	public ResponseEntity<GetPremiumInsuranceModel> getpremiumDetails(@PathVariable("id") Integer id){
	GetPremiumInsuranceModel GPIM=getPremiumInsuranceService.getPremiumDetails(id);
	return ResponseEntity.ok().body(GPIM);
}
}

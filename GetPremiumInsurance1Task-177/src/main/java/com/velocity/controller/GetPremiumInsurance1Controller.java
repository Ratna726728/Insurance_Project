package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.velocity.model.GetPremiumInsurance1Model;
import com.velocity.service.GetPremiumInsurance1Service;
@RestController
public class GetPremiumInsurance1Controller {
	@Autowired
	private GetPremiumInsurance1Service getPremiumInsurance1Service;
	@GetMapping("/get/1")
	public ResponseEntity<GetPremiumInsurance1Model> getDetails(@PathVariable("id") Integer id){
	GetPremiumInsurance1Model GPIM1=getPremiumInsurance1Service.getDetails(id);
	return ResponseEntity.ok().body(GPIM1);
}
}


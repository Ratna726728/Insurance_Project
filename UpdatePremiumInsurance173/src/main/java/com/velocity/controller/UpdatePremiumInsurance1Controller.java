package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.velocity.model.UpdatePremiumInsurance1Model;
import com.velocity.service.UpdatePremiumInsurance1Service;
@RestController
public class UpdatePremiumInsurance1Controller {
	@Autowired
	private UpdatePremiumInsurance1Service updatePremiumInsurance1Service;
	@GetMapping("/get/1")
	public ResponseEntity<UpdatePremiumInsurance1Model> updateDetails(@PathVariable("id") Integer id){
	UpdatePremiumInsurance1Model GPIM1=updatePremiumInsurance1Service.updateDetails(id);
	return ResponseEntity.ok().body(GPIM1);
}
}


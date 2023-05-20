package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.DeletePremiumInsuranceModel;
import com.velocity.service.DeletePremiumInsuranceService;

@RestController
public class DeletePremiumInsuranceController {
@Autowired
private DeletePremiumInsuranceService deletePremiumInsuranceService;
	@GetMapping("/get/{Id}")
	public ResponseEntity<DeletePremiumInsuranceModel> getInsuranceDetails(@PathVariable("id") Integer id){
	 DeletePremiumInsuranceModel deleteP=deletePremiumInsuranceService.getInsuranceDetails(id);
	 return ResponseEntity.ok().body(deleteP);
}
}

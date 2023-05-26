package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.velocity.model.InsertPremiumInsuranceModel;
import com.velocity.service.InsertPremiumInsuranceService;


public class InsertPremiumInsuranceController {
	@Autowired
	private InsertPremiumInsuranceService insertPremiumInsuranceService ;
	@PostMapping("/save")
	public ResponseEntity<InsertPremiumInsuranceModel> savePremiumInsurance(@RequestBody InsertPremiumInsuranceModel insertPremiumInsuranceModel ){
		InsertPremiumInsuranceModel IPIM=insertPremiumInsuranceService.savePremiumInsurance(insertPremiumInsuranceModel);
		return ResponseEntity.ok().body(IPIM);

}
}

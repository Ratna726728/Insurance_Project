package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.velocity.model.GetClaimDetailsModel;
import com.velocity.service.GetClaimDetailsService;
@RestController
public class GetPremiumInsurance1Controller {
	@Autowired
	private GetClaimDetailsService getClaimService;
	@GetMapping("get")
	public ResponseEntity<GetClaimDetailsModel> getDetails(@PathVariable("id") Integer id){
	GetClaimDetailsModel GPIM1=getClaimService.getDetails(id);
	return ResponseEntity.ok().body(GPIM1);
}
}


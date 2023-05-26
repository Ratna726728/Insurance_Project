package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.velocity.model.FetchClaimDetailsModel;
import com.velocity.service.FetchClaimDetailsService;
@RestController
public class FetchClaimDetailsController {
	@Autowired
	private FetchClaimDetailsService fetchClaimDetailsService;
	@GetMapping("get")
	public ResponseEntity<FetchClaimDetailsModel> getDetails(@PathVariable("id") Integer id){
	FetchClaimDetailsModel FCM=fetchClaimDetailsService.getDetails(id);
	return ResponseEntity.ok().body(FCM);
}
}


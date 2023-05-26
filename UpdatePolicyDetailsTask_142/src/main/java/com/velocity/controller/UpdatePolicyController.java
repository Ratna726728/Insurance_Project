package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.velocity.model.UpdatepolicyModel;
import com.velocity.service.UpdatePolicyService;
@RestController
public class UpdatePolicyController {
	@Autowired
	private UpdatePolicyService updatePolicyService;
	@GetMapping("/get/1")
	public ResponseEntity<UpdatepolicyModel> updateDetails(@PathVariable("id") Integer id){
	UpdatepolicyModel UPM=updatePolicyService.updateDetails(id);
	return ResponseEntity.ok().body(UPM);
}
}


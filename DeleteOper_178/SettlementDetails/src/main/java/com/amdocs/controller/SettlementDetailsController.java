package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.service.SettlementDetailsService;

@RestController
public class SettlementDetailsController {
	
	@Autowired
	private SettlementDetailsService settlementDetailsService;
	
	@DeleteMapping("delete/{id}")
	public void deleteSettlementDetailsById(@PathVariable("id") Integer id) {
		settlementDetailsService.deleteSettlementDetails(id);
	}
	

}

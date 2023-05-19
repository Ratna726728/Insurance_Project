package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.model.Settlement;
import com.amdocs.service.SettlementService;

@RestController
public class SettlementController {

	// inject the settlementservice
	@Autowired
	private SettlementService settlementService;

	@PostMapping("/savesettlement")
	public ResponseEntity<Settlement> saveSettlement(@RequestBody Settlement settlement) {
		Settlement settlement2 = settlementService.saveSettlement(settlement);
		return ResponseEntity.ok().body(settlement);
	}

}

package com.amdocs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.model.Settlement;
import com.amdocs.repository.SettlementRepository;
import com.amdocs.service.SettlementService;

@Service
public class SettlementServiceImpl implements SettlementService {

	// inject settlementrepository
	@Autowired
	private SettlementRepository settlementRepository;

	@Override
	public Settlement saveSettlement(Settlement settlement) {
		Settlement settlement1 = settlementRepository.save(settlement);
		return settlement1;
	}

}

package com.amdocs.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.repository.SettlementDetailsRepository;
import com.amdocs.service.SettlementDetailsService;

@Service
public class SettlementDetailsServiceImpl implements SettlementDetailsService{

	@Autowired
	private SettlementDetailsRepository settlementDetailsRepository;
	
	@Override
	public void deleteSettlementDetails(Integer id) {
		settlementDetailsRepository.deleteById(id);
		
	}

}

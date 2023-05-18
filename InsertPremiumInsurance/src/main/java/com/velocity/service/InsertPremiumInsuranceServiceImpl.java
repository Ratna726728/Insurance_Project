package com.velocity.service;

import org.springframework.stereotype.Service;

import com.velocity.model.InsertPremiumInsuranceModel;
import com.velocity.repository.InsertPremiumInsuranceRepository;
@Service
public class InsertPremiumInsuranceServiceImpl implements InsertPremiumInsuranceService  {
	
	private InsertPremiumInsuranceRepository insertPremiumInsuranceRepository;
@Override
	public InsertPremiumInsuranceModel savePremiumInsurance(InsertPremiumInsuranceModel insertPremiumInsuranceModel) {
		return insertPremiumInsuranceRepository.save(insertPremiumInsuranceModel);
	}
}

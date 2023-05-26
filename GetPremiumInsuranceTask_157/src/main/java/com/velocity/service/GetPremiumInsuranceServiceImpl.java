package com.velocity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.GetPremiumInsuranceModel;
import com.velocity.repository.GetPremiumInsuranceRepository;

@Service
public class GetPremiumInsuranceServiceImpl implements GetPremiumInsuranceService{
	@Autowired
	private GetPremiumInsuranceRepository getPremiumInsuranceRepository;
	public GetPremiumInsuranceModel getPremiumDetails(Integer id) {
		GetPremiumInsuranceModel GPIM  =getPremiumInsuranceRepository.findPremiumDetails(id);
		return GPIM;
	}
}

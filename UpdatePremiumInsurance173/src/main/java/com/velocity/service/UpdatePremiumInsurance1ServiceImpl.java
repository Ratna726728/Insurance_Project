package com.velocity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.Repository.UpdatePremiumInsurance1Repository;
import com.velocity.model.UpdatePremiumInsurance1Model;
@Service
public class UpdatePremiumInsurance1ServiceImpl implements UpdatePremiumInsurance1Service {
	
	@Autowired
	private UpdatePremiumInsurance1Repository updatePremiumInsurance1Repository;
	@Override
	public UpdatePremiumInsurance1Model updateDetails(Integer id) {
		UpdatePremiumInsurance1Model UPIM1= updatePremiumInsurance1Repository.findUpdateDetails(id);
		return UPIM1; 
	}
}

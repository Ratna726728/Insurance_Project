package com.velocity.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.velocity.model.GetPremiumInsurance1Model;
import com.velocity.repository.GetPremiumInsurance1Repository;



@Service
public class GetPremiumInsurance1ServiceImpl implements GetPremiumInsurance1Service {
@Autowired
private GetPremiumInsurance1Repository getPremiumInsurance1Repository;

@Override
public GetPremiumInsurance1Model getDetails(Integer id) {
	GetPremiumInsurance1Model GPIM1=getPremiumInsurance1Repository.findDetails(id);	
	return GPIM1;
}
}

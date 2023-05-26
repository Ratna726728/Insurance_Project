package com.velocity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.Repository.DeletePremiumInsuranceRepository;
import com.velocity.model.DeletePremiumInsuranceModel;

@Service
public class DeletepremiumInsuranceServiceImpl implements DeletePremiumInsuranceService {
@Autowired
private DeletePremiumInsuranceRepository deletePremiumInsuranceRepository; 

@Override
public DeletePremiumInsuranceModel getInsuranceDetails(Integer id){
	DeletePremiumInsuranceModel DPIM=deletePremiumInsuranceRepository.findInsuranceDetails(id);
	return DPIM;
}
}

package com.amdocs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.repository.PremiumRepository;
import com.amdocs.service.PremiumService;

@Service

public class PremiumServiceImpl implements PremiumService {
	
   // inject the Repository reference
	@Autowired
	private PremiumRepository premiumRepository;
	@Override
	public void deleteById(Integer id) {
		 premiumRepository.deleteById(id);
		
		
	}

}

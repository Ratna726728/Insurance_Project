package com.amdocs.service.implemetation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.model.PremiumDetails;
import com.amdocs.repository.PremiumDetailsRepository;
import com.amdocs.service.PremiumDetailsService;

@Service
public class PremiumDetailsServiceImpl implements PremiumDetailsService {

	@Autowired
	private PremiumDetailsRepository premiumDetailsRepository;

	@Override
	public PremiumDetails savePremiumDetails(PremiumDetails premiumDetails) {

		return premiumDetailsRepository.save(premiumDetails);
	}

}

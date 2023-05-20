package com.amdocs.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.amdocs.model.NomineeDetails;
import com.amdocs.repository.NomineeDetailsRepository;
import com.amdocs.service.NomineeDetailsService;

public class NomineedetailsServiceImpl implements NomineeDetailsService {

	@Autowired
	private NomineeDetailsRepository nomineeDetailsRepository;
	
	@Override
	public NomineeDetails getNomineeDetailsById(Integer id) {
		
		NomineeDetails nominee = nomineeDetailsRepository.findById(id);
		
		return nominee;
	}
	

}

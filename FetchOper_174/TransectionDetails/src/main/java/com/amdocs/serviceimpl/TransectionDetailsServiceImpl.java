package com.amdocs.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.model.TransectionDetails;
import com.amdocs.repository.TransectionDetailsRepository;
import com.amdocs.service.TransectionDetailsService;

@Service
public class TransectionDetailsServiceImpl implements TransectionDetailsService {

	/*
	 * injecting repository to serviceimpl
	 */
	@Autowired
	private TransectionDetailsRepository transectionDetailsRepository;
	
	@Override
	public TransectionDetails getTransectionDetailsById(Integer id) {
		 
		return transectionDetailsRepository.findById(id);
	}

}

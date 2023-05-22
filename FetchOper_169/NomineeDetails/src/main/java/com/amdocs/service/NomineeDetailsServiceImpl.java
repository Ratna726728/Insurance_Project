package com.amdocs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.model.NomineeDetails;
import com.amdocs.repository.NomineeDetailsRepository;

@Service
public class NomineeDetailsServiceImpl implements NomineeDetailsService {

	@Autowired
	private NomineeDetailsRepository nomineeDetailsRepository;
	@Override
	public List<NomineeDetails> getListByName(String nominee_name) {
		List<NomineeDetails> nomineeDetails = nomineeDetailsRepository.findByName(nominee_name);
		return nomineeDetails;
	}

}

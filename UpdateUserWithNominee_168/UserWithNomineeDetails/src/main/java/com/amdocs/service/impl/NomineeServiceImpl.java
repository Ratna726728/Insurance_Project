package com.amdocs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.model.Nominee;
import com.amdocs.repository.NomineeRepository;
import com.amdocs.service.NomineeService;

@Service
public class NomineeServiceImpl implements NomineeService {

	// inject the repository reference
	@Autowired
	private NomineeRepository NomineeRepository;

	@Override
	public Nominee updateNominee(Nominee nominee) {
		Integer id = nominee.getId();
		Nominee nominee1 = NomineeRepository.findById(id).get();
		nominee1.setId(nominee1.getId());
		nominee1.setNomineeName(nominee1.getNomineeName());
		nominee1.setNomineeLastName(nominee1.getNomineeLastName());
		nominee1.setNomineeGender(nominee1.getNomineeGender());
		nominee1.setNomineeAddress(nominee1.getNomineeAddress());
		nominee1.setNomineePolicyName(nominee1.getNomineePolicyName());
		return nominee1;
	}

}

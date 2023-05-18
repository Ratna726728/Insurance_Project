package com.amdocs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.model.PolicySchedule;
import com.amdocs.repository.PolicyScheduleRepository;
import com.amdocs.service.PolicyScheduleService;

@Service
public class PolicyScheduleServiceImpl implements PolicyScheduleService {

	// inject repository referencre
	@Autowired
	private PolicyScheduleRepository policyScheduleRepository;

	@Override
	public PolicySchedule savePolicySchedule(PolicySchedule policySchedule) {
		PolicySchedule policySchedule1 = policyScheduleRepository.save(policySchedule);
		return policySchedule1;
	}

}

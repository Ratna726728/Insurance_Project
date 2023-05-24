package com.amdocs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.model.PolicySchedule;
import com.amdocs.repository.PolicyScheduleRepository;
import com.amdocs.service.PolicyScheduleService;

@Service
public class PolicyScheduleServiceImpl implements PolicyScheduleService {

	private static final Object PolicySchedule = null;
	// inject repository reference
	@Autowired
	private PolicyScheduleRepository policyScheduleRepository;

	@Override
	public PolicySchedule getPolicyScheduleByID(Integer id) {
		PolicySchedule policySchedule = policyScheduleRepository.findById(id);
		return policySchedule;
	}

	@Override
	public PolicySchedule savePolicySchedule(PolicySchedule policySchedule) {
		PolicySchedule policySchedule1 = policyScheduleRepository.save(policySchedule);
		return policySchedule;
	}
}

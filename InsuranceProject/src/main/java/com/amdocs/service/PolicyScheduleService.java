package com.amdocs.service;

import com.amdocs.model.PolicySchedule;

public interface PolicyScheduleService {

	// fecth the data based on id

	public PolicySchedule getPolicyScheduleByID(Integer id);
	
	public  PolicySchedule savePolicySchedule(PolicySchedule policySchedule);

}

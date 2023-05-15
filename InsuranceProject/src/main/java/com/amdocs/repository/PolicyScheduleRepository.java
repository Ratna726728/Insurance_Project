package com.amdocs.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.amdocs.model.PolicySchedule;

public interface PolicyScheduleRepository extends CrudRepository<PolicySchedule, Serializable> {

	public PolicySchedule findById(Integer id);

}

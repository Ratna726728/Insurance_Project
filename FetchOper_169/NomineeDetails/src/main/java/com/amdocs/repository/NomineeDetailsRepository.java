package com.amdocs.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.amdocs.model.NomineeDetails;

public interface NomineeDetailsRepository extends CrudRepository<NomineeDetails, Serializable>{
	
	public NomineeDetails findById(Integer id);

}

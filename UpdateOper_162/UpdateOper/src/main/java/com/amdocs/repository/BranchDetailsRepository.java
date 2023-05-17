package com.amdocs.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.model.BranchDetails;



@Repository
public interface BranchDetailsRepository extends CrudRepository<BranchDetails, Serializable> {
	
	public BranchDetails findById(Integer id);	

}

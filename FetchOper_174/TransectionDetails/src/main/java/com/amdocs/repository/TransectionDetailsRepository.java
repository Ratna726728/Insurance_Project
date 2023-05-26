package com.amdocs.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.model.TransectionDetails;
@Repository
public interface TransectionDetailsRepository extends CrudRepository<TransectionDetails, Serializable> {
	
	public TransectionDetails findById(Integer id);

}

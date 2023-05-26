package com.amdocs.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.amdocs.model.NomineeDetails;

public interface NomineeDetailsRepository extends CrudRepository<NomineeDetails, Serializable>{
	
	@Query(value="select * from nominee where nominee_name=?", nativeQuery=true)
	List<NomineeDetails> findByName(String nominee_name);
	

}

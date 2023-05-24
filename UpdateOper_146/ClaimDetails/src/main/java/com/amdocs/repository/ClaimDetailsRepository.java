package com.amdocs.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.model.ClaimDetails;

@Repository
public interface ClaimDetailsRepository extends CrudRepository<ClaimDetails, Long>{

	//public ClaimDetails findById(Integer id);

}

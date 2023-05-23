package com.amdocs.repository;

import java.io.Serializable;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.model.PolicyPremium;

@Repository
public interface PolicyPremiumRepository extends CrudRepository<PolicyPremium, Serializable> {
	
	public PolicyPremium findById(Integer id); 


}

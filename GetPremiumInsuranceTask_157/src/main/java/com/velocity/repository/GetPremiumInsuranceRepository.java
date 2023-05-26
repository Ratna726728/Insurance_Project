package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.GetPremiumInsuranceModel;

@Repository
public interface GetPremiumInsuranceRepository extends CrudRepository<GetPremiumInsuranceModel,Serializable> {
public GetPremiumInsuranceModel findPremiumDetails(Integer id); 
}

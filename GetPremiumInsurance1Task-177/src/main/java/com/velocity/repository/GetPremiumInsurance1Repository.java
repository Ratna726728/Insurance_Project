package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.velocity.model.GetPremiumInsurance1Model;


public interface GetPremiumInsurance1Repository extends CrudRepository<GetPremiumInsurance1Model, Serializable> {
	public GetPremiumInsurance1Model findDetails(Integer id);
	

}

package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.velocity.model.FetchClaimDetailsModel;


public interface FetchClaimDetailsRepository extends CrudRepository<FetchClaimDetailsModel, Serializable> {
	public FetchClaimDetailsModel findDetails(Integer id);
	

}

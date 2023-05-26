package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.velocity.model.GetClaimDetailsModel;


public interface GetClaimDetailsRepository extends CrudRepository<GetClaimDetailsModel, Serializable> {
	public GetClaimDetailsModel findDetails(Integer id);
	

}

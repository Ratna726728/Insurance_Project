package com.velocity.Repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.velocity.model.DeletePremiumInsuranceModel;

public interface DeletePremiumInsuranceRepository extends CrudRepository<DeletePremiumInsuranceModel, Serializable>{
	public DeletePremiumInsuranceModel findInsuranceDetails(Integer id);

}

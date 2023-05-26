package com.velocity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.velocity.model.UpdatepolicyModel;

public interface UpdatePolicyRepository extends JpaRepository<UpdatepolicyModel, Integer> {
	public UpdatepolicyModel findUpdateDetails(Integer id);
}

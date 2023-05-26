package com.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.velocity.model.InsertPremiumInsuranceModel;

public interface InsertPremiumInsuranceRepository extends JpaRepository<InsertPremiumInsuranceModel,Integer> {
	
}

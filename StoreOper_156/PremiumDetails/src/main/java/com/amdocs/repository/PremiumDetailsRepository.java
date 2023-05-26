package com.amdocs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.amdocs.model.PremiumDetails;

@Repository
public interface PremiumDetailsRepository extends JpaRepository<PremiumDetails, Integer> {
	
	

	
}

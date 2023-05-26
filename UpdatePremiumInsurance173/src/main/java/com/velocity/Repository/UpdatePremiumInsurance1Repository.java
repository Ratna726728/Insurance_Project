package com.velocity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.velocity.model.UpdatePremiumInsurance1Model;

public interface UpdatePremiumInsurance1Repository extends JpaRepository<UpdatePremiumInsurance1Model, Integer> {
	public UpdatePremiumInsurance1Model findUpdateDetails(Integer id);
}

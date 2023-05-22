package com.amdocs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.model.AddClaim;

@Repository
public interface AddClaimRepository extends JpaRepository<AddClaim, Integer> {

}

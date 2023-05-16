package com.amdocs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.model.BranchDetails;

import jakarta.persistence.Id;

@Repository
public interface BranchDetailsRepository extends JpaRepository<BranchDetails, Id> {

}

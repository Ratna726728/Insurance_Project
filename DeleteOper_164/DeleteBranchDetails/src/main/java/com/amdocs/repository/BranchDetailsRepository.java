package com.amdocs.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.amdocs.model.BranchDetails;

public interface BranchDetailsRepository extends CrudRepository<BranchDetails, Serializable> {

}

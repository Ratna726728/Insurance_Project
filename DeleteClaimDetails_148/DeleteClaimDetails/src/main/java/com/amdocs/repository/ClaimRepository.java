package com.amdocs.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.model.Claim;

@Repository
public interface ClaimRepository extends CrudRepository<Claim, Serializable> {

}

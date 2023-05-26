package com.amdocs.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.model.SettlementDetails;

@Repository
public interface SettlementDetailsRepository extends CrudRepository<SettlementDetails, Serializable> {

}

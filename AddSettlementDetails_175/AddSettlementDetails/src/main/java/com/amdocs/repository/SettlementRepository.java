package com.amdocs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.model.Settlement;

@Repository
public interface SettlementRepository extends JpaRepository<Settlement, Integer> {

}

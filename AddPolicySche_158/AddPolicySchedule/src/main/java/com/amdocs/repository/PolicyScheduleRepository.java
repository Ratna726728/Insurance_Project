package com.amdocs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.model.PolicySchedule;

@Repository
public interface PolicyScheduleRepository extends JpaRepository<PolicySchedule, Integer> {

}

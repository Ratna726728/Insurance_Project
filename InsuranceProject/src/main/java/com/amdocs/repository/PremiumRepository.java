package com.amdocs.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.model.Premium;

@Repository
public interface PremiumRepository extends CrudRepository<Premium, Serializable>{

}

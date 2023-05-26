package com.amdocs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.model.UserDetails;

@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails, Long>{

}

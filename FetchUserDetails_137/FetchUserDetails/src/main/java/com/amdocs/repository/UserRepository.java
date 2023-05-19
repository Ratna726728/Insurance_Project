package com.amdocs.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Serializable> {
	public User findById(Integer Id);
}

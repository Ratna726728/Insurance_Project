package com.amdocs.repository;

//import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.model.BranchDetails;

/*
 * @Repository
   public interface DepartmentRepository extends CrudRepository<Department, Long> {
     
}
 */

@Repository
public interface BranchDetailsRepository extends CrudRepository<BranchDetails, Long> {
	
//	public BranchDetails findById(Integer id);	

}

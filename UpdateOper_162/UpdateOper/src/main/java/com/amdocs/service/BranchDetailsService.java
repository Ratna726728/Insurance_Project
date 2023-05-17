package com.amdocs.service;



import com.amdocs.model.BranchDetails;

public interface BranchDetailsService {
	
//	public BranchDetails getBranchDetailsById(Integer id);

	// Update operation
    BranchDetails updateBranchDetails(BranchDetails branchDetails, Long id);
	
}

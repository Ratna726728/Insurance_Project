package com.amdocs.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.amdocs.repository.BranchDetailsRepository;
import com.amdocs.service.BranchDetailsService;

@Service
public class BranchDetailsServiceImpl implements BranchDetailsService{

	@Autowired
	private BranchDetailsRepository branchDetailsRepostiory;
	
	@Override
	public void deleteBranchDetails(Integer id) {
		branchDetailsRepostiory.deleteById(id);
	}

}

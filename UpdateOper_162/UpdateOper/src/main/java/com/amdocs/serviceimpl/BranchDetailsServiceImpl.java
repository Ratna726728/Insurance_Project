package com.amdocs.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.model.BranchDetails;
import com.amdocs.repository.BranchDetailsRepository;
import com.amdocs.service.BranchDetailsService;


@Service
public class BranchDetailsServiceImpl implements BranchDetailsService {

	
	@Autowired
	private BranchDetailsRepository branchDetailsRepository;
	
	@Override
	public BranchDetails getBranchDetailsById(Integer id) {
		BranchDetails branchDetails3 = branchDetailsRepository.findById(id);
		return branchDetails3;
	}
	

	

}

package com.amdocs.serviceimpl;

import java.util.Objects;

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
	public BranchDetails updateBranchDetails(BranchDetails branchDetails, Long id) {

		 BranchDetails bd1 = branchDetailsRepository.findById(id).get();

		 if (Objects.nonNull(branchDetails.getBranch_name()) && !"".equalsIgnoreCase(branchDetails.getBranch_name())) {
			 bd1.setBranch_name(branchDetails.getBranch_name());
		 }

		 if (Objects.nonNull(branchDetails.getBranch_Address()) && !"".equalsIgnoreCase(branchDetails.getBranch_Address())) {
			 bd1.setBranch_Address(branchDetails.getBranch_Address());
		 }
		 
		 if (Objects.nonNull(branchDetails.getBranch_code()) && !"".equalsIgnoreCase(branchDetails.getBranch_code())) {
			 bd1.setBranch_code(branchDetails.getBranch_code());
		 }
		 
		 if (Objects.nonNull(branchDetails.getBranch_ifsc()) && !"".equalsIgnoreCase(branchDetails.getBranch_ifsc())) {
			 bd1.setBranch_ifsc(branchDetails.getBranch_ifsc());
		 }
		 
		 if (Objects.nonNull(branchDetails.getBranch_city()) && !"".equalsIgnoreCase(branchDetails.getBranch_city())) {
			 bd1.setBranch_city(branchDetails.getBranch_city());
		 }
		 
		 if (Objects.nonNull(branchDetails.getBranch_state()) && !"".equalsIgnoreCase(branchDetails.getBranch_state())) {
			 bd1.setBranch_state(branchDetails.getBranch_state());
		 }
		 
		 if (Objects.nonNull(branchDetails.getBranch_country()) && !"".equalsIgnoreCase(branchDetails.getBranch_country())) {
			 bd1.setBranch_country(branchDetails.getBranch_country());
		 }
		 
		 if (Objects.nonNull(branchDetails.getBranch_zipcode()) && !"".equalsIgnoreCase(branchDetails.getBranch_zipcode())) {
			 bd1.setBranch_zipcode(branchDetails.getBranch_zipcode());
		 }

		return branchDetailsRepository.save(bd1);

		
	}

	
//	@Autowired
//	private BranchDetailsRepository branchDetailsRepository;
//	
//	@Override
//	public BranchDetails getBranchDetailsById(Integer id) {
//		BranchDetails branchDetails3 = branchDetailsRepository.findById(id);
//		return branchDetails3;
//	}
//	
//
//	

}

package com.amdocs.serviceimpl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.model.ClaimDetails;
import com.amdocs.repository.ClaimDetailsRepository;
import com.amdocs.service.ClaimDetailsService;

@Service
public class ClaimDetailsServiceImpl implements ClaimDetailsService {

	@Autowired
	private ClaimDetailsRepository claimDetailsRepository;
	
	@Override
	public ClaimDetails updateClaimDetails(ClaimDetails claimDetails, Long id) {
		
		 ClaimDetails claim = claimDetailsRepository.findById(id).get();

		 if (Objects.nonNull(claimDetails.getClaim_id()) && !"".equalsIgnoreCase(claimDetails.getClaim_id())) {
			 claim.setClaim_id(claimDetails.getClaim_id());
		 }

		 if (Objects.nonNull(claimDetails.getPolicy_id()) && !"".equalsIgnoreCase(claimDetails.getPolicy_id())) {
			 claim.setPolicy_id(claimDetails.getPolicy_id());
		 }
		 
		 if (Objects.nonNull(claimDetails.getClaim_status()) && !"".equalsIgnoreCase(claimDetails.getClaim_status())) {
			 claim.setClaim_status(claimDetails.getClaim_status());
		 }
		 
		 if (Objects.nonNull(claimDetails.getClaim_amount()) && !"".equalsIgnoreCase(claimDetails.getClaim_amount())) {
			 claim.setClaim_amount(claimDetails.getClaim_amount());
		 }
		 
		return claimDetailsRepository.save(claim);

		
	}

}

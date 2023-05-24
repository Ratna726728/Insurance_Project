package com.amdocs.service;

import com.amdocs.model.ClaimDetails;

public interface ClaimDetailsService {
	
	// Update operation
    ClaimDetails updateClaimDetails(ClaimDetails claimDetails, Long id);

}

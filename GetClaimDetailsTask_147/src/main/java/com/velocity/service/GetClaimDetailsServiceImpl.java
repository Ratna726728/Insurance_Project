package com.velocity.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.velocity.model.GetClaimDetailsModel;
import com.velocity.repository.GetClaimDetailsRepository;

@Service
public class GetClaimDetailsServiceImpl implements GetClaimDetailsService {
@Autowired
private GetClaimDetailsRepository getClaimDetailsRepository;

@Override
public GetClaimDetailsModel getDetails(Integer id) {
	GetClaimDetailsModel GCM=getClaimDetailsRepository.findDetails(id);	
	return GCM;
}
}

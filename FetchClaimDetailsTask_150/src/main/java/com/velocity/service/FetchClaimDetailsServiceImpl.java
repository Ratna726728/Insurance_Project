package com.velocity.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.velocity.model.FetchClaimDetailsModel;
import com.velocity.repository.FetchClaimDetailsRepository;

@Service
public class FetchClaimDetailsServiceImpl implements FetchClaimDetailsService {
@Autowired
private FetchClaimDetailsRepository fetchClaimDetailsRepository;

@Override
public FetchClaimDetailsModel getDetails(Integer id) {
	FetchClaimDetailsModel FCM=fetchClaimDetailsRepository.findDetails(id);	
	return FCM;
}
}

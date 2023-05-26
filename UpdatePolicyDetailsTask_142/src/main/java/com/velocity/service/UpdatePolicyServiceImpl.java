package com.velocity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.Repository.UpdatePolicyRepository;
import com.velocity.model.UpdatepolicyModel;
@Service
public class UpdatePolicyServiceImpl implements UpdatePolicyService {
	
	@Autowired
	private UpdatePolicyRepository updatePolicyRepository;
	@Override
	public UpdatepolicyModel updateDetails(Integer id) {
		UpdatepolicyModel UPM= updatePolicyRepository.findUpdateDetails(id);
		return UPM; 
	}
}

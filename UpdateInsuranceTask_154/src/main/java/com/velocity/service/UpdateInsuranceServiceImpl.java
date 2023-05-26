package com.velocity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.UpdateInsuranceModel;
import com.velocity.repository.UpdateInsuranceRepository;
@Service
public class UpdateInsuranceServiceImpl implements UpdateInsuranceService{

	@Autowired
private UpdateInsuranceRepository updateInsuranceRepository;
	
	@Override
	public UpdateInsuranceModel updateData(UpdateInsuranceModel updateInsuranceModel) {
		return updateInsuranceModel.create(updateInsuranceModel);
	}
}

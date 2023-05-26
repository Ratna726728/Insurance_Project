package com.amdocs.service;

import java.util.List;

import com.amdocs.model.NomineeDetails;

public interface NomineeDetailsService {
	public List<NomineeDetails> getListByName(String nominee_name);

}

package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.service.PremiumService;

@RestController
public class PremiumController {

	//inject the service 
	@Autowired
	private PremiumService premiumService;
	
	//Design Restful Web services to delete the data based on the id
	@DeleteMapping("/delete/{id}")
	public void deletePremiumById(@PathVariable("id") Integer id) {
		//calling the method
		
		premiumService.deleteById(id);
		
	}
}

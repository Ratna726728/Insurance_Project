package com.amdocs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy")
public class PolicySchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String User_name;
	private String Policy_name;
	private String Plan_Name;
	private String Premium_amount;

	// generate getter and setter method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_name() {
		return User_name;
	}

	public void setUser_name(String user_name) {
		User_name = user_name;
	}

	public String getPolicy_name() {
		return Policy_name;
	}

	public void setPolicy_name(String policy_name) {
		Policy_name = policy_name;
	}

	public String getPlan_Name() {
		return Plan_Name;
	}

	public void setPlan_Name(String plan_Name) {
		Plan_Name = plan_Name;
	}

	public String getPremium_amount() {
		return Premium_amount;
	}

	public void setPremium_amount(String premium_amount) {
		Premium_amount = premium_amount;
	}

}

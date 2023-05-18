package com.amdocs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="premiumDetails")
public class PremiumDetails {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String premium_id;
	private String policy_id;
	private String policy_holder_name;
	private String installment_premium_amount;
	private String policy_commencement_date;
	private String policy_schedule_table;
	private String policy_name;
	private String plan_name;
	private String user_name;
	private String premium_amount;
	
//	generating getter and setter for variables 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPremium_id() {
		return premium_id;
	}
	public void setPremium_id(String premium_id) {
		this.premium_id = premium_id;
	}
	public String getPolicy_id() {
		return policy_id;
	}
	public void setPolicy_id(String policy_id) {
		this.policy_id = policy_id;
	}
	public String getPolicy_holder_name() {
		return policy_holder_name;
	}
	public void setPolicy_holder_name(String policy_holder_name) {
		this.policy_holder_name = policy_holder_name;
	}
	public String getInstallment_premium_amount() {
		return installment_premium_amount;
	}
	public void setInstallment_premium_amount(String installment_premium_amount) {
		this.installment_premium_amount = installment_premium_amount;
	}
	public String getPolicy_commencement_date() {
		return policy_commencement_date;
	}
	public void setPolicy_commencement_date(String policy_commencement_date) {
		this.policy_commencement_date = policy_commencement_date;
	}
	public String getPolicy_schedule_table() {
		return policy_schedule_table;
	}
	public void setPolicy_schedule_table(String policy_schedule_table) {
		this.policy_schedule_table = policy_schedule_table;
	}
	public String getPolicy_name() {
		return policy_name;
	}
	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}
	public String getPlan_name() {
		return plan_name;
	}
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPremium_amount() {
		return premium_amount;
	}
	public void setPremium_amount(String premium_amount) {
		this.premium_amount = premium_amount;
	}
	
//	Generating toString() methods
	@Override
	public String toString() {
		return "PremiumDetails [id=" + id + ", premium_id=" + premium_id + ", policy_id=" + policy_id
				+ ", policy_holder_name=" + policy_holder_name + ", installment_premium_amount="
				+ installment_premium_amount + ", policy_commencement_date=" + policy_commencement_date
				+ ", policy_schedule_table=" + policy_schedule_table + ", policy_name=" + policy_name + ", plan_name="
				+ plan_name + ", user_name=" + user_name + ", premium_amount=" + premium_amount + "]";
	}
	
	
	


}

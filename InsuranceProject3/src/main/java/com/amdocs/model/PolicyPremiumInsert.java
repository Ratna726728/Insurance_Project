package com.amdocs.model;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "Premium_info")
public class PolicyPremiumInsert {

	/*
	 * Details required to insert in table: Id, Premium id, Policy id, Policy holder
	 * name, Installment premium amount, Policy commencement date, Policy schedule
	 * table, Policy Name, Plan Name, User Name, Premium Amount
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Premium_id;
	private String Policy_id;
	private String Policy_holder_name;
	private String Installment_Premium_amount;
	private String Policy_commencement_date;
	private String Policy_schedule_table;
	private String Policy_Name;
	private String Plan_Name;
	private String User_Name;
	private String Premium_Amount;

//	Generating Getter and Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPremium_id() {
		return Premium_id;
	}

	public void setPremium_id(String premium_id) {
		Premium_id = premium_id;
	}

	public String getPolicy_id() {
		return Policy_id;
	}

	public void setPolicy_id(String policy_id) {
		Policy_id = policy_id;
	}

	public String getPolicy_holder_name() {
		return Policy_holder_name;
	}

	public void setPolicy_holder_name(String policy_holder_name) {
		Policy_holder_name = policy_holder_name;
	}

	public String getInstallment_Premium_amount() {
		return Installment_Premium_amount;
	}

	public void setInstallment_Premium_amount(String installment_Premium_amount) {
		Installment_Premium_amount = installment_Premium_amount;
	}

	public String getPolicy_commencement_date() {
		return Policy_commencement_date;
	}

	public void setPolicy_commencement_date(String policy_commencement_date) {
		Policy_commencement_date = policy_commencement_date;
	}

	public String getPolicy_schedule_table() {
		return Policy_schedule_table;
	}

	public void setPolicy_schedule_table(String policy_schedule_table) {
		Policy_schedule_table = policy_schedule_table;
	}

	public String getPolicy_Name() {
		return Policy_Name;
	}

	public void setPolicy_Name(String policy_Name) {
		Policy_Name = policy_Name;
	}

	public String getPlan_Name() {
		return Plan_Name;
	}

	public void setPlan_Name(String plan_Name) {
		Plan_Name = plan_Name;
	}

	public String getUser_Name() {
		return User_Name;
	}

	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}

	public String getPremium_Amount() {
		return Premium_Amount;
	}

	public void setPremium_Amount(String premium_Amount) {
		Premium_Amount = premium_Amount;
	}

//	Generating toString() method
	@Override
	public String toString() {
		return "PolicyPremiumInsert [id=" + id + ", Premium_id=" + Premium_id + ", Policy_id=" + Policy_id
				+ ", Policy_holder_name=" + Policy_holder_name + ", Installment_Premium_amount="
				+ Installment_Premium_amount + ", Policy_commencement_date=" + Policy_commencement_date
				+ ", Policy_schedule_table=" + Policy_schedule_table + ", Policy_Name=" + Policy_Name + ", Plan_Name="
				+ Plan_Name + ", User_Name=" + User_Name + ", Premium_Amount=" + Premium_Amount + "]";
	}

}

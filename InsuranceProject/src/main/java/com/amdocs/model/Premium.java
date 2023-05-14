package com.amdocs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="premium")

public class Premium {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int premiumId;
	private int policyId;
	private String policyHolderName;
    private String installment_PremiumName;
	private String policy_CommencementDate;
	private String policy_ScheduleTable;
	private String policyName;
	private String planName;
	private String userName;
	private String premiumAmount;
	
	//generate getter and seeter method
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPremiumId() {
		return premiumId;
	}
	public void setPremiumId(int premiumId) {
		this.premiumId = premiumId;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public String getInstallment_PremiumName() {
		return installment_PremiumName;
	}
	public void setInstallment_PremiumName(String installment_PremiumName) {
		this.installment_PremiumName = installment_PremiumName;
	}
	public String getPolicy_CommencementDate() {
		return policy_CommencementDate;
	}
	public void setPolicy_CommencementDate(String policy_CommencementDate) {
		this.policy_CommencementDate = policy_CommencementDate;
	}
	public String getPolicy_ScheduleTable() {
		return policy_ScheduleTable;
	}
	public void setPolicy_ScheduleTable(String policy_ScheduleTable) {
		this.policy_ScheduleTable = policy_ScheduleTable;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(String premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	
	
}

package com.velocity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="insurancedetails")
public class DeletePremiumInsuranceModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String installmentpremiumamount;
	private String policycommencementdate;
	private int policyid;
	private int premiumid;
	private String policyholdername;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInstallmentpremiumamount() {
		return installmentpremiumamount;
	}
	public void setInstallmentpremiumamount(String installmentpremiumamount) {
		this.installmentpremiumamount = installmentpremiumamount;
	}
	public String getPolicycommencementdate() {
		return policycommencementdate;
	}
	public void setPolicycommencementdate(String policycommencementdate) {
		this.policycommencementdate = policycommencementdate;
	}
	public int getPolicyid() {
		return policyid;
	}
	public void setPolicyid(int policyid) {
		this.policyid = policyid;
	}
	public int getPremiumid() {
		return premiumid;
	}
	public void setPremiumid(int premiumid) {
		this.premiumid = premiumid;
	}
	public String getPolicyholdername() {
		return policyholdername;
	}
	public void setPolicyholdername(String policyholdername) {
		this.policyholdername = policyholdername;
	}
	
}

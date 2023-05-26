package com.velocity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="insurancedetails")
public class UpdateInsuranceModel {
	@jakarta.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private int Premiumid;
	private int Policyid;
	private String policyholdername;
	private String Installmentpremiumamount;
	private String Policycommencementdate;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getPremiumid() {
		return Premiumid;
	}
	public void setPremiumid(int premiumid) {
		Premiumid = premiumid;
	}
	public int getPolicyid() {
		return Policyid;
	}
	public void setPolicyid(int policyid) {
		Policyid = policyid;
	}
	public String getPolicyholdername() {
		return policyholdername;
	}
	public void setPolicyholdername(String policyholdername) {
		this.policyholdername = policyholdername;
	}
	public String getInstallmentpremiumamount() {
		return Installmentpremiumamount;
	}
	public void setInstallmentpremiumamount(String installmentpremiumamount) {
		Installmentpremiumamount = installmentpremiumamount;
	}
	public String getPolicycommencementdate() {
		return Policycommencementdate;
	}
	public void setPolicycommencementdate(String policycommencementdate) {
		Policycommencementdate = policycommencementdate;
	}
	@Override
	public String toString() {
		return "UpdateInsuranceModel [Id=" + Id + ", Premiumid=" + Premiumid + ", Policyid=" + Policyid
				+ ", policyholdername=" + policyholdername + ", Installmentpremiumamount=" + Installmentpremiumamount
				+ ", Policycommencementdate=" + Policycommencementdate + "]";
	}
	public UpdateInsuranceModel create(UpdateInsuranceModel updateInsuranceModel) {
		// TODO Auto-generated method stub
		return null;
	}


}

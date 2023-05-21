package com.velocity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="transectiondetails")
public class GetPremiumInsurance1Model {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int TransectionId;
	private String Amount;
	private int PolicyId;
	private String Status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTransectionId() {
		return TransectionId;
	}
	public void setTransectionId(int transectionId) {
		TransectionId = transectionId;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public int getPolicyId() {
		return PolicyId;
	}
	public void setPolicyId(int policyId) {
		PolicyId = policyId;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}

}

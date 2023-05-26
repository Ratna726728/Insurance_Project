package com.velocity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="claimdetails")
public class FetchClaimDetailsModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
private int id;
private int ClaimId;
private int PolicyId;
private Boolean ClaimStatus;
private Double ClaimAmount;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getClaimId() {
	return ClaimId;
}
public void setClaimId(int claimId) {
	ClaimId = claimId;
}
public int getPolicyId() {
	return PolicyId;
}
public void setPolicyId(int policyId) {
	PolicyId = policyId;
}
public Boolean getClaimStatus() {
	return ClaimStatus;
}
public void setClaimStatus(Boolean claimStatus) {
	ClaimStatus = claimStatus;
}
public Double getClaimAmount() {
	return ClaimAmount;
}
public void setClaimAmount(Double claimAmount) {
	ClaimAmount = claimAmount;
}

	

}

package com.amdocs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="claim_details")
public class ClaimDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String claim_id;
	private String policy_id;
	private String claim_status;
	private String claim_amount;
	/*
	 * GENRATING GETTER AND SETTERS
	 */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getClaim_id() {
		return claim_id;
	}
	public void setClaim_id(String claim_id) {
		this.claim_id = claim_id;
	}
	public String getPolicy_id() {
		return policy_id;
	}
	public void setPolicy_id(String policy_id) {
		this.policy_id = policy_id;
	}
	public String getClaim_status() {
		return claim_status;
	}
	public void setClaim_status(String claim_status) {
		this.claim_status = claim_status;
	}
	public String getClaim_amount() {
		return claim_amount;
	}
	public void setClaim_amount(String claim_amount) {
		this.claim_amount = claim_amount;
	}
	/*
	 * GENERATING toString() methods
	 */
	@Override
	public String toString() {
		return "ClaimDetails [id=" + id + ", claim_id=" + claim_id + ", policy_id=" + policy_id + ", claim_status="
				+ claim_status + ", claim_amount=" + claim_amount + "]";
	}
	

}

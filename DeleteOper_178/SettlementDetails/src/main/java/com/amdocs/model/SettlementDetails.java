package com.amdocs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="settlement_details")
public class SettlementDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String settlement_id;
	private String settlement_date;
	private String amount;
	private String claim_id;
	private String settlement_status;
	/*
	 * generating Getter and Setters
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSettlement_id() {
		return settlement_id;
	}
	public void setSettlement_id(String settlement_id) {
		this.settlement_id = settlement_id;
	}
	public String getSettlement_date() {
		return settlement_date;
	}
	public void setSettlement_date(String settlement_date) {
		this.settlement_date = settlement_date;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getClaim_id() {
		return claim_id;
	}
	public void setClaim_id(String claim_id) {
		this.claim_id = claim_id;
	}
	public String getSettlement_status() {
		return settlement_status;
	}
	public void setSettlement_status(String settlement_status) {
		this.settlement_status = settlement_status;
	}
	/*
	 * overriding toString() method
	 */
	@Override
	public String toString() {
		return "SettlementDetails [id=" + id + ", settlement_id=" + settlement_id + ", settlement_date="
				+ settlement_date + ", amount=" + amount + ", claim_id=" + claim_id + ", settlement_status="
				+ settlement_status + "]";
	}

	
}

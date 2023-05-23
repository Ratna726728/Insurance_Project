package com.amdocs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="transection")
public class TransectionDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String transection_id;
	private String amount;
	private String policy_id;
	private String transection_status;
	
/*
 * 	Generating Getter and Setters
 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTransection_id() {
		return transection_id;
	}
	public void setTransection_id(String transection_id) {
		this.transection_id = transection_id;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getPolicy_id() {
		return policy_id;
	}
	public void setPolicy_id(String policy_id) {
		this.policy_id = policy_id;
	}
	public String getTransection_status() {
		return transection_status;
	}
	public void setTransection_status(String transection_status) {
		this.transection_status = transection_status;
	}
	
/*
 * overriding toString() method
 */
	@Override
	public String toString() {
		return "TransectionDetails [id=" + id + ", transection_id=" + transection_id + ", amount=" + amount
				+ ", policy_id=" + policy_id + ", transection_status=" + transection_status + "]";
	}
	
	


}

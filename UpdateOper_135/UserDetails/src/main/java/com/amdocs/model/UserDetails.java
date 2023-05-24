package com.amdocs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String user_name;
	private String user_address;
	private String policy_id;
	private String nominee_status;
	/*
	 * generating getter and setters
	 */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getPolicy_id() {
		return policy_id;
	}
	public void setPolicy_id(String policy_id) {
		this.policy_id = policy_id;
	}
	public String getNominee_status() {
		return nominee_status;
	}
	public void setNominee_status(String nominee_status) {
		this.nominee_status = nominee_status;
	}
	/*
	 * Generating toString() method
	 */
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", user_name=" + user_name + ", user_address=" + user_address + ", policy_id="
				+ policy_id + ", nominee_status=" + nominee_status + "]";
	}
	
	
	
}

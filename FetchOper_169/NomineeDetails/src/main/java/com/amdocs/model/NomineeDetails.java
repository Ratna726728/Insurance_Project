package com.amdocs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="nominee")
public class NomineeDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int id;
	private String nominee_name;
	private String nominee_age;
	private String nominee_gender;
	private String nominee_address;
	private String nominee_policy_name;
	private String nominee_pan_id;
	private String nominee_consent;//yes or no
	private String nominee_takeback_amout;
	
	
//	generating getters and setters method
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNominee_name() {
		return nominee_name;
	}
	public void setNominee_name(String nominee_name) {
		this.nominee_name = nominee_name;
	}
	public String getNominee_age() {
		return nominee_age;
	}
	public void setNominee_age(String nominee_age) {
		this.nominee_age = nominee_age;
	}
	public String getNominee_gender() {
		return nominee_gender;
	}
	public void setNominee_gender(String nominee_gender) {
		this.nominee_gender = nominee_gender;
	}
	public String getNominee_address() {
		return nominee_address;
	}
	public void setNominee_address(String nominee_address) {
		this.nominee_address = nominee_address;
	}
	public String getNominee_policy_name() {
		return nominee_policy_name;
	}
	public void setNominee_policy_name(String nominee_policy_name) {
		this.nominee_policy_name = nominee_policy_name;
	}
	public String getNominee_pan_id() {
		return nominee_pan_id;
	}
	public void setNominee_pan_id(String nominee_pan_id) {
		this.nominee_pan_id = nominee_pan_id;
	}
	public String getNominee_consent() {
		return nominee_consent;
	}
	public void setNominee_consent(String nominee_consent) {
		this.nominee_consent = nominee_consent;
	}
	public String getNominee_takeback_amout() {
		return nominee_takeback_amout;
	}
	public void setNominee_takeback_amout(String nominee_takeback_amout) {
		this.nominee_takeback_amout = nominee_takeback_amout;
	}
	
//	overriding toString() methods
	@Override
	public String toString() {
		return "NomineeDetails [id=" + id + ", nominee_name=" + nominee_name + ", nominee_age=" + nominee_age
				+ ", nominee_gender=" + nominee_gender + ", nominee_address=" + nominee_address
				+ ", nominee_policy_name=" + nominee_policy_name + ", nominee_pan_id=" + nominee_pan_id
				+ ", nominee_consent=" + nominee_consent + ", nominee_takeback_amout=" + nominee_takeback_amout + "]";
	}
	
	
	

}

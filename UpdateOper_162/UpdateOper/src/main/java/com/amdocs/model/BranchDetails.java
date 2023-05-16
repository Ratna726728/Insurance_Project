package com.amdocs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "branch_details")
public class BranchDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String branch_name;
	private String branch_Address;
	private String branch_code;
	private String branch_ifsc;
	private String branch_city;
	private String branch_state;
	private String branch_country;
	private String branch_zipcode;
	
//	generating getter and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getBranch_Address() {
		return branch_Address;
	}
	public void setBranch_Address(String branch_Address) {
		this.branch_Address = branch_Address;
	}
	public String getBranch_code() {
		return branch_code;
	}
	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}
	public String getBranch_ifsc() {
		return branch_ifsc;
	}
	public void setBranch_ifsc(String branch_ifsc) {
		this.branch_ifsc = branch_ifsc;
	}
	public String getBranch_city() {
		return branch_city;
	}
	public void setBranch_city(String branch_city) {
		this.branch_city = branch_city;
	}
	public String getBranch_state() {
		return branch_state;
	}
	public void setBranch_state(String branch_state) {
		this.branch_state = branch_state;
	}
	public String getBranch_country() {
		return branch_country;
	}
	public void setBranch_country(String branch_country) {
		this.branch_country = branch_country;
	}
	public String getBranch_zipcode() {
		return branch_zipcode;
	}
	public void setBranch_zipcode(String branch_zipcode) {
		this.branch_zipcode = branch_zipcode;
	}
	
//	Generating toString() method
	@Override
	public String toString() {
		return "UpdateDetails [id=" + id + ", branch_name=" + branch_name + ", branch_Address=" + branch_Address
				+ ", branch_code=" + branch_code + ", branch_ifsc=" + branch_ifsc + ", branch_city=" + branch_city
				+ ", branch_state=" + branch_state + ", branch_country=" + branch_country + ", branch_zipcode="
				+ branch_zipcode + "]";
	}
	
	
	

}

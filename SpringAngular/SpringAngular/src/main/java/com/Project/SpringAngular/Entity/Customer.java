package com.Project.SpringAngular.Entity;

import jakarta.persistence.Table;

@Table(name="customer")
public class Customer {
	
	private int customerId;
	private String customername;
	private int mobile;
	public Customer(int customerId, String customername, int mobile) {
		super();
		this.customerId = customerId;
		this.customername = customername;
		this.mobile = mobile;
	}
	//Create a BLank Constructor
	public Customer()
	{
		
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
}

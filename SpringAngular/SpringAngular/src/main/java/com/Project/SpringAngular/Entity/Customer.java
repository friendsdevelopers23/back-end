package com.Project.SpringAngular.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="customer")
public class Customer {
	@Id
	@Column(name="Customer_Id",length=50)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerId;
	
	@Column(name="Customer_name",length=60)
	private String customername;
	
	@Column(name="Customer_Address",length=60)
	private String customeraddress;
	
	@Column(name="Mobile",length=12)
	private int mobile;
	
	public Customer(int customerId, String customername, String customeraddress, int mobile) {
		super();
		this.customerId = customerId;
		this.customername = customername;
		this.customeraddress = customeraddress;
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

	public String getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customername=" + customername + ", customeraddress="
				+ customeraddress + ", mobile=" + mobile + ", getCustomerId()=" + getCustomerId()
				+ ", getCustomername()=" + getCustomername() + ", getCustomeraddress()=" + getCustomeraddress()
				+ ", getMobile()=" + getMobile() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}

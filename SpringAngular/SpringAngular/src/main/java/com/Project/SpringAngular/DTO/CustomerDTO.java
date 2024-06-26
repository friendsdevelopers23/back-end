package com.Project.SpringAngular.DTO;



public class CustomerDTO {

	private int customerId;
	private String customername;
	private String customeraddress;
	private int mobile;
	public CustomerDTO(int customerId, String customername, String customeraddress, int mobile) {
		super();
		this.customerId = customerId;
		this.customername = customername;
		this.customeraddress = customeraddress;
		this.mobile = mobile;
	}
	public CustomerDTO() {
		
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
		return "CustomerDTO [customerId=" + customerId + ", customername=" + customername + ", customeraddress="
				+ customeraddress + ", mobile=" + mobile + ", getCustomerId()=" + getCustomerId()
				+ ", getCustomername()=" + getCustomername() + ", getCustomeraddress()=" + getCustomeraddress()
				+ ", getMobile()=" + getMobile() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}

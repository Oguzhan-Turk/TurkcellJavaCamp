package com.instagram.models.account;

import com.instagram.models.commerce.Product;

public class BusinessAccount extends Account {

	private String companyName;
	private String officeAddress;
	private String businessPhoneNumber;
	private Product[] products;

	public BusinessAccount(int id, String userName, String eMail, String phoneNumber, short password,
			String profilePicture, String companyName, String officeAddress, String businessPhoneNumber,
			Product[] products) {
		super(id, userName, eMail, phoneNumber, password, profilePicture);
		this.companyName = companyName;
		this.officeAddress = officeAddress;
		this.businessPhoneNumber = businessPhoneNumber;
		this.products = products;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getBusinessPhoneNumber() {
		return businessPhoneNumber;
	}

	public void setBusinessPhoneNumber(String businessPhoneNumber) {
		this.businessPhoneNumber = businessPhoneNumber;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

}

package com.instagram.models.commerce;

import com.instagram.models.account.BusinessAccount;

public class Product {

	private int id;
	private BusinessAccount dealer;
	private String name;
	private String description;
	private String[] images;
	private double unitPrice;

	public Product(int id, BusinessAccount dealer, String name, String description, double unitPrice) {
		this.id = id;
		this.dealer = dealer;
		this.name = name;
		this.description = description;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}
//
	public void setId(int id) {
		this.id = id;
	}

	public BusinessAccount getDealer() {
		return dealer;
	}

	public void setDealer(BusinessAccount dealer) {
		this.dealer = dealer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}

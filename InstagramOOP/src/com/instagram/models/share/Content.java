package com.instagram.models.share;

import java.time.LocalDateTime;

import com.instagram.models.account.Account;
import com.instagram.models.commerce.Product;

public abstract class Content {

	private int id;
	private Account postOwner;
	private String[] content;
	private LocalDateTime dateOfPosting = LocalDateTime.now();
	private Product[] products;

	public Content(int id, Account postOwner, String[] content, String profilePicture, LocalDateTime dateOfPosting) {
		this.id = id;
		this.postOwner = postOwner;
		this.content = content;
		this.dateOfPosting = dateOfPosting;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//
	public Account getPostOwner() {
		return postOwner;
	}

	public void setPostOwner(Account postOwner) {
		this.postOwner = postOwner;
	}

	public String[] getContent() {
		return content;
	}

	public void setContent(String[] content) {
		this.content = content;
	}

	public LocalDateTime getDateOfPosting() {
		return dateOfPosting;
	}

	public void setDateOfPosting(LocalDateTime dateOfPosting) {
		this.dateOfPosting = dateOfPosting;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

}

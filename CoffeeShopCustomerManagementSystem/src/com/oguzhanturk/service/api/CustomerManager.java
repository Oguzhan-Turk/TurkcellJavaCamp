package com.oguzhanturk.service.api;

import com.oguzhanturk.entity.Customer;

public abstract class CustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db : " + customer.getFirstName());

	}

}
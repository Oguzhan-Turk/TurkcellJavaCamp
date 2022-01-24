package com.oguzhanturk.service;

import com.oguzhanturk.entity.Customer;
import com.oguzhanturk.service.api.CustomerService;

public abstract class CustomerManager implements CustomerService {

	@Override
	public void save(Customer customer)  throws Exception {
		System.out.println("Saved to db : " + customer.getFirstName() + " " + customer.getLastName());
	}

}

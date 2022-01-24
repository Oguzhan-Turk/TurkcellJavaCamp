package com.oguzhanturk.service;

import com.oguzhanturk.entity.Customer;
import com.oguzhanturk.service.api.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		
		return true;
	}



}

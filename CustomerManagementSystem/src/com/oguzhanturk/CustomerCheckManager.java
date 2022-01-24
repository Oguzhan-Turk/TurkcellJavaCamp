package com.oguzhanturk;

import com.oguzhanturk.entity.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		
		return true;
	}



}

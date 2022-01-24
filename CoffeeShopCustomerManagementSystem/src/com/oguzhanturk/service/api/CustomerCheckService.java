package com.oguzhanturk.service.api;

import com.oguzhanturk.entity.Customer;

public interface CustomerCheckService {

	boolean checkIfRealPerson(Customer customer);
}
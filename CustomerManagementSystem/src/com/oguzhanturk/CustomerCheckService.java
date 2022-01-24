package com.oguzhanturk;

import com.oguzhanturk.entity.Customer;

public interface CustomerCheckService {

	boolean checkIfRealPerson(Customer customer);
}

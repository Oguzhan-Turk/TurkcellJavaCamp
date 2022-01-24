package com.oguzhanturk.service.api;

import com.oguzhanturk.entity.Car;

public interface CarService {


	Car add(Car car);

	boolean update(Car car);

	Car delete(int id);
	
}

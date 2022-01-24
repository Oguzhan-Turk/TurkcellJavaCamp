package com.oguzhanturk.repository;

import com.oguzhanturk.entity.Car;

public interface CarRepo {

	Car add(Car car);

	boolean update(Car car);

	Car delete(int id);

	Car findById(int id);
}

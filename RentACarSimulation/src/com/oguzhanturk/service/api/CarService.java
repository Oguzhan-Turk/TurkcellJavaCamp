package com.oguzhanturk.service.api;

import java.util.List;

import com.oguzhanturk.entity.Car;

public interface CarService {

	Car add(Car car);

	boolean update(Car car);

	Car delete(int id);

	Car findById(int id);

	List<Car> getAllCars();

}

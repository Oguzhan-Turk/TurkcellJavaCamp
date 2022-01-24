package com.oguzhanturk.controller;

import java.util.List;

import com.oguzhanturk.entity.Car;
import com.oguzhanturk.service.api.CarService;

public class CarController {

	private final CarService service;

	public CarController(CarService service) {
		this.service = service;
	}

	public Car save(Car car) {
		return service.add(car);
	}

	public Car deleteById(int id) {
		return service.delete(id);
	}

	public boolean update(Car car) {
		return service.update(car);
	}

	public List<Car> getAllCars() {
		return service.getAllCars();
	}

	public Car findById(int id) {
		return service.findById(id);
	}
}

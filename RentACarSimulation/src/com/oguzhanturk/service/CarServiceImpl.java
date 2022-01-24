package com.oguzhanturk.service;

import java.util.List;

import com.oguzhanturk.entity.Car;
import com.oguzhanturk.repository.CarRepo;
import com.oguzhanturk.service.api.CarService;
import com.oguzhanturk.util.logger.FileLogger;

public class CarServiceImpl implements CarService {

	private CarRepo carRepo;
	private static final FileLogger LOGGER = new FileLogger(CarServiceImpl.class);

	public CarServiceImpl(CarRepo carRepo) {
		this.carRepo = carRepo;
	}

	@Override
	public Car add(Car car) {
		Car addedCar = this.carRepo.add(car);
		LOGGER.log(car.getName() + " eklendi");
		return addedCar;
	}

	@Override
	public boolean update(Car car) {
		boolean update = this.carRepo.update(car);
		LOGGER.log(car.getName() + " güncellendi");
		return update;
	}

	@Override
	public Car delete(int id) {
		Car deletedCar = this.carRepo.delete(id);
		LOGGER.log(deletedCar.getName() + " silindi");
		return deletedCar;
	}

	@Override
	public Car findById(int id) {
		return carRepo.findById(id);
	}

	@Override
	public List<Car> getAllCars() {
		return carRepo.findAll();
	}

}

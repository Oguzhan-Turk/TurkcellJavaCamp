package com.oguzhanturk.service;

import com.oguzhanturk.entity.Car;
import com.oguzhanturk.repository.CarRepo;
import com.oguzhanturk.service.api.CarService;

public class CarServiceImpl implements CarService {

	private CarRepo carRepo;

	public CarServiceImpl(CarRepo carRepo) {
		super();
		this.carRepo = carRepo;
	}

	@Override
	public Car add(Car car) {
		Car addedCar = this.carRepo.add(car);
		System.out.println("Eklendi");
		return addedCar;
	}

	@Override
	public boolean update(Car car) {
		boolean update = this.carRepo.update(car);
		System.out.println("Güncellendi");
		return update;
	}

	@Override
	public Car delete(int id) {
		Car Deletedcar = this.carRepo.delete(id);
		System.out.println("Silindi");
		return Deletedcar;
	}

}

package com.oguzhanturk.main;

import com.oguzhanturk.entity.Brand;
import com.oguzhanturk.entity.Car;
import com.oguzhanturk.entity.Color;
import com.oguzhanturk.repository.CarMsSqlRepo;
import com.oguzhanturk.repository.CarOracleRepo;
import com.oguzhanturk.repository.CarRepo;
import com.oguzhanturk.service.CarServiceImpl;

public class Main {

	public static void main(String[] args) {

		Car car1 = new Car(1, "G-Max", new Brand(1, "Ford"), new Color(1, "White"));
		Car car2 = new Car(2, "C-Max", new Brand(1, "Ford"), new Color(2, "Black"));

		CarRepo msSql = new CarMsSqlRepo();
		CarRepo oracle = new CarOracleRepo();
		CarServiceImpl carService = new CarServiceImpl(msSql);

		carService.add(car1);

	}

}

package com.oguzhanturk.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.oguzhanturk.entity.Car;

public class CarOracleRepo implements CarRepo {

	private Map<Integer, Car> oracleCarMap = new HashMap<Integer, Car>();

	@Override
	public Car add(Car car) {
		oracleCarMap.put(car.getId(), car);
		System.out.println("Oracle DB'ye kaydedildi");
		return car;
	}

	@Override
	public boolean update(Car car) {

		if (!Objects.isNull(findById(car.getId()))) {
			oracleCarMap.put(car.getId(), car);
			System.out.println("Oracle DB'de güncellendi");
			return true;
		}
		return false;
	}

	@Override
	public Car delete(int id) {
		Car willBeRemoved = oracleCarMap.remove(id);
		if (willBeRemoved != null) {
			System.out.println("Oracle DB'den silindi");
		}
		return willBeRemoved;
	}

	@Override
	public Car findById(int id) {
		return oracleCarMap.get(id);
	}

}

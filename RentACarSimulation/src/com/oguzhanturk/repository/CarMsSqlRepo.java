package com.oguzhanturk.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.oguzhanturk.entity.Car;

public class CarMsSqlRepo implements CarRepo {
	private Map<Integer, Car> msSqlCarMap = new HashMap<Integer, Car>();

	@Override
	public Car add(Car car) {
		msSqlCarMap.put(car.getId(), car);
		System.out.println("MsSql DB'ye kaydedildi");
		return car;
	}

	@Override
	public boolean update(Car car) {

		if (!Objects.isNull(findById(car.getId()))) {
			msSqlCarMap.put(car.getId(), car);
			System.out.println("MsSql DB'de güncellendi");
			return true;
		}
		return false;
	}

	@Override
	public Car delete(int id) {
		Car willBeRemoved = msSqlCarMap.remove(id);
		if (willBeRemoved != null) {
			System.out.println("MsSql DB'den silindi");
		}
		return willBeRemoved;
	}

	@Override
	public Car findById(int id) {
		return msSqlCarMap.get(id);
	}

}

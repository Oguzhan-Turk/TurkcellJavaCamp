package com.oguzhanturk.main;

import com.oguzhanturk.controller.CarController;
import com.oguzhanturk.entity.Brand;
import com.oguzhanturk.entity.Car;
import com.oguzhanturk.entity.Color;
import com.oguzhanturk.service.CarServiceImpl;
import com.oguzhanturk.util.DBFactory;
import com.oguzhanturk.util.Format;
import com.oguzhanturk.util.Utils;

public class RentACarApplication {

	private CarController controller = new CarController(
			new CarServiceImpl(DBFactory.create(Utils.getPropertyForDBImpl())));

	public RentACarApplication() {
		init();
	}

	public void run() {
		System.out.print(Format.CAR_INFO_HEADER_FORMAT);
		controller.getAllCars().forEach(car -> System.out.printf(Format.CAR_INFO_FORMAT, car.getId(), car.getName(),
				car.getBrand().getName(), car.getColor().getName()));
		controller.deleteById(1);
		Car car = controller.findById(2);
		car.setColor(new Color(-1, "Purple"));
		controller.update(car);

	}

	private void init() {
		Car car = new Car(1, "G-Max", new Brand(1, "Ford"), new Color(3, "Navy"));
		controller.save(car);
		car = new Car(2, "Leon", new Brand(2, "Seat"), new Color(1, "White"));
		controller.save(car);
		car = new Car(3, "Corolla", new Brand(3, "Toyota"), new Color(4, "Gray"));
		controller.save(car);
		car = new Car(4, "Punto", new Brand(4, "Fiat"), new Color(1, "White"));
		controller.save(car);
		car = new Car(5, "Hilux", new Brand(3, "Toyota"), new Color(5, "Red"));
		controller.save(car);

	}

	public static void main(String[] args) {
		RentACarApplication rentACarApplication = new RentACarApplication();
		rentACarApplication.run();
	}

}

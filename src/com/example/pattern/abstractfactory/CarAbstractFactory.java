package com.example.pattern.abstractfactory;

import com.example.pattern.factory.Car;

public class CarAbstractFactory {
	
	public Car getCar(CarFactories car) {
		return car.createCar();
	}
	private CarAbstractFactory() {
		
	}
	static CarAbstractFactory carfactory=new CarAbstractFactory();
	
	public static CarAbstractFactory getInstance() {
		return carfactory;
	}

}

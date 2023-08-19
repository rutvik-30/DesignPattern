package com.example.pattern.abstractfactory;

import com.example.pattern.factory.Car;
import com.example.pattern.factory.Jaguar;

public class JaguarFactory  implements CarFactories{

	private static final String name="JAGUAR";
	private String carColor;
	private String carModel;
	
	
	public JaguarFactory(String carColor, String carModel) {
		super();
		this.carColor = carColor;
		this.carModel = carModel;
	}


	@Override
	public Car createCar() {
	 return new Jaguar(carColor, carModel);
	}
}

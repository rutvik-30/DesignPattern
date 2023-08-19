package com.example.pattern.abstractfactory;

import com.example.pattern.factory.Bmw;
import com.example.pattern.factory.Car;

public class BmwFactory implements CarFactories{
	
	private static final String name="BMW";
	private String carColor;
	private String carModel;
	
	
	public BmwFactory(String carColor, String carModel) {
		super();
		this.carColor = carColor;
		this.carModel = carModel;
	}


	@Override
	public Car createCar() {
		
		return new Bmw(carColor, carColor);
	}
	
	

}

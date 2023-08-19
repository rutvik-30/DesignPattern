package com.example.pattern.creational;

import java.util.ArrayList;
import java.util.List;

public class Jaguar extends Car {

	
	private static final String name="BMW";
	private String carColor;
	private String carModel;
	
	
	public Jaguar(String color, String mode) {
		super();
		
		this.carColor = color(color);
		this.carModel = model(mode) ;
	}

	static List<String> list=new ArrayList<>();
	static List<String> list2=new ArrayList<>();
	
	static {
		list.add("Land");
		list.add("Rover");
		list.add("Q7");	
		
		list2.add("Blue");
		list2.add("White");
		list2.add("Black");
		
	}
	
	@Override
	public String model(String mo) {
		if(list.contains(mo)) {
			return mo;
		}
		return "Model not available";
	}

	@Override
	public String speed() {
		
		return "135 km/hr";
	}

	@Override
	public String color(String color) {
		if(list2.contains("color")) {
			return color;
		}
		return "Color Not available";
	}

	@Override
	public String toString() {
		return "Jaguar [carColor=" + carColor + ", carModel=" + carModel + ", speed()=" + speed() + "]";
	}

}

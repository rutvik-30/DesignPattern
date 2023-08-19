package com.example.pattern.factory;

public abstract class Car {
	
	public abstract String model(String model);
	public abstract String speed();
	public abstract String color(String color);
	
	@Override
	public String toString() {
		return "Car [speed()=" + speed() + "]";
	}
	
	
	
	
}

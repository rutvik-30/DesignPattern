package com.example.pattern.factory;

public class MainFactory {

	public static void main(String args[]) {
		
		//FactoryPattern factory=new FactoryPattern();
		Car car=FactoryPattern.getCar("Bmw","Bl","X60");
		System.out.println(car.toString());
		
		
		System.out.println(FactoryPattern.getInstance().hashCode());
		System.out.println(FactoryPattern.getInstance().hashCode());
		
	}
}

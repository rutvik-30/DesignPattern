package com.example.pattern.abstractfactory;

import com.example.pattern.factory.Bmw;
import com.example.pattern.factory.Car;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		
		CarAbstractFactory cfac=CarAbstractFactory.getInstance();
		
		Car c=cfac.getCar(new BmwFactory("white","X60"));
		Car c1=cfac.getCar(new JaguarFactory("white","Land"));
		System.out.println(c.toString());
		System.out.println(c1.toString());
	}

}

package com.example.pattern.factory;

// This design pattern is used when we have a super class and muultiple subclass inheriting it.
public class FactoryPattern {
	 
	private FactoryPattern() {
		
	}
	
	static FactoryPattern pattern=new FactoryPattern();
	
	public static FactoryPattern getInstance() {
		return pattern;
	}
	
	public static Car getCar(String type,String color,String model) {
		if(type.equals("Bmw")) {
			return new Bmw(color,model);
		}
		else if(type.equals("Jaguar")) {
			return new Jaguar(color,model);
		}
		return null;
	}
	
	
}

package com.example.pattern.factory;
import java.util.List;
import java.util.ArrayList;

 public class Bmw extends Car {

	private static final String name="BMW";
	private String carColor;
	private String carModel;
	
	
	public Bmw(String color, String mode) {
		super();
		
		this.carColor = color(color);
		this.carModel = model(mode) ;
	}

	static List<String> list=new ArrayList<>();
	static List<String> list2=new ArrayList<>();
	
	static {
		list.add("X60");
		list.add("Z60");
		list.add("Magna");	
		
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
		if(list2.contains(color)) {
			return color;
		}
		return "Color Not available";
	}

	@Override
	public String toString() {
		return "Bmw [carColor=" + carColor + ", carModel=" + carModel + ", speed()=" + speed() + "]";
	}

}
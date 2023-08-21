package com.example.pattern.builderfactory;
import java.util.List;
import java.util.ArrayList;

 public class Bmw{

	private static final String name="BMW";
	
	private String carColor;
	private String carModel;
	private boolean isCarAvailable;
	private boolean isColorAvailable;
	
	
	private Bmw(BmwBuilder builder) {
		super();
		
		this.carColor = builder.color;
		this.carModel = builder.model;
		this.isCarAvailable=builder.isCarAvailable;
		this.isColorAvailable=builder.isColorAvailable;
	}
	
	

	public static String getName() {
		return name;
	}



	public String getCarColor() {
		return carColor;
	}



	@Override
	public String toString() {
		return "Bmw [carColor=" + carColor + ", carModel=" + carModel + ", isCarAvailable=" + isCarAvailable
				+ ", isColorAvailable=" + isColorAvailable + "]";
	}



	public String getCarModel() {
		return carModel;
	}



	public boolean isCarAvailable() {
		return isCarAvailable;
	}



	public boolean isColorAvailable() {
		return isColorAvailable;
	}



	public static class BmwBuilder{

		public boolean isColorAvailable;
		public boolean isCarAvailable;
		
		public String color;
		public String model;
		

		public BmwBuilder setColorAvailable(boolean isColorAvailable) {
			this.isColorAvailable = isColorAvailable;
			return this;
		}


		public BmwBuilder setCarAvailable(boolean isCarAvailable) {
			this.isCarAvailable = isCarAvailable;
			return this;
			
		}
		
		public BmwBuilder(String color, String model) {
			super();
			this.color = color;
			this.model = model;
		}


		public Bmw build() {
			return new Bmw(this);
		}
		
		
		
		
		
	}

}
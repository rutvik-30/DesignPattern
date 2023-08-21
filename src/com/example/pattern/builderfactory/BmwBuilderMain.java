package com.example.pattern.builderfactory;

import com.example.pattern.builderfactory.Bmw.BmwBuilder;

public class BmwBuilderMain {
	
	public static void main(String args[]) {
		
		Bmw bmw=new Bmw.BmwBuilder("White","X60").setColorAvailable(true).setCarAvailable(true).build();
		System.out.println(bmw);
	}

}

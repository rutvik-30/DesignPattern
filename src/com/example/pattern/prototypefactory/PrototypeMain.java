package com.example.pattern.prototypefactory;
import java.util.*;

public class PrototypeMain {
	
	public static void main(String args[]) throws CloneNotSupportedException {
		
		Dataclass d1=new Dataclass();
		d1.getData();
		
		Dataclass d2=(Dataclass) d1.clone();
		Dataclass d3=(Dataclass) d1.clone();
		
		List<String> d2res=d2.getList();
		d2res.add("Grapes");
		System.out.println(d2res);
		
		List<String> d3res=d3.getList();
		d3res.add("Pineapple");
		d3res.add("Chickoo");
		System.out.println(d3res);
		
	}

}

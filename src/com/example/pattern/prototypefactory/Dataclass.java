package com.example.pattern.prototypefactory;

import java.util.*;

public class Dataclass implements Cloneable {
	
	// class which is loading the data from the database
	
	List<String> list=new ArrayList<>();
	
	public Dataclass(List<String> list) {
		super();
		this.list = list;
	}
	public Dataclass() {
		// TODO Auto-generated constructor stub
	}
	public void getData(){
		
		list.add("Mango");
		list.add("Banana");
		list.add("Pineapple");
		list.add("Apple");	
	}
	
	public List<String> getList() {
		return list;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String> temp=new ArrayList<>();
		for(String i:list) {
			temp.add(i);
		}
		return new Dataclass(temp);
	}

}

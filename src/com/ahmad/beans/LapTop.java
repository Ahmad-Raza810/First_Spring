package com.ahmad.beans;

public class LapTop {
	private String brand;

	public LapTop() {
       System.out.println("LapTop created.....");
	}

	public String getbrand() {
		return brand;
	}

	public void setbrand(String name) {
		this.brand = name;
		System.out.println("Laptop intialized by name setters..");
	}
	

}

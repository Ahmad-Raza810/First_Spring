package com.ahmad.beans;

public class LapTop implements Device{
	private String name;
	public LapTop() {
       System.out.println("LapTop created.....");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("LapTop name intialized/injected..");
		
	}

	@Override
	public void start() {
      System.out.println("Laptop started...");	
      System.out.println("LapTop Name:"+name);

	}
	

}

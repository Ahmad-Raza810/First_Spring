package com.ahmad.beans;

public class DeskTop implements Device{
    private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("DeskTop name intialized/injected..");
		
	}

	public DeskTop() {
      System.out.println("DeskTop created......");
	}

	@Override
	public void start() {
         System.out.println("Desktop started");	
         System.out.println("DeskTop Name:"+name);
	}
	

}

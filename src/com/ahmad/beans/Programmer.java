package com.ahmad.beans;

public class Programmer {
	private String name;
    private LapTop lt;
	public Programmer() {
		System.out.println("Programmer created...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Name intialized through settter.");
	}

	public LapTop getLt() {
		return lt;
	}

	public void setLt(LapTop lt) {
		this.lt = lt;
	}
	
	
	

}

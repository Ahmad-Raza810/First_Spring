package com.ahmad.beans;

public class Programmer {
	private Device d;
	private String pName;
	

	public String getpName() {
		return pName;
	}

	public Programmer() {
        System.out.println("Programmer created...");
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Device getD() {
		return d;
	}

	public void setD(Device d) {
		this.d = d;
		}
	
	
	
}

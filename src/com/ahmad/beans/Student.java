package com.ahmad.beans;

public class Student {
  private int rollno;
  private String name;
  
  Student(){
	  System.out.println("Student bean created..");
  }

  public int getRollno() {
	return rollno;
  }

  public void setRollno(int rollno) {
	this.rollno = rollno;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }
  

}

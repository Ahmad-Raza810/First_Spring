package com.ahmad.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ahmad.beans.LapTop;
import com.ahmad.beans.Programmer;
import com.ahmad.beans.Student;

public class Main {
	public static void main(String[] args) {
	
		ApplicationContext container=new ClassPathXmlApplicationContext("/com/ahmad/resources/config.xml");
		 //Student s1=(Student)container.getBean("stu1");
		 //Student s2=(Student)container.getBean("stu2");
		 //Student s2=(Student)container.getBean("stu3");


		//System.out.println("name: "+s1.getName()+"\nrollno: "+s1.getRollno());
		//System.out.println("name: "+s2.getName()+"\nrollno: "+s2.getRollno());
  
		Programmer p1=container.getBean("p1",Programmer.class);
		Programmer p2=container.getBean("p2",Programmer.class);
		
		p1.getD().start();
		p2.getD().start();
		System.out.println("p1 name:"+p1.getpName()+"\np2 name: "+p2.getpName());
		//System.out.println("name: "+p1.getD());
		//System.out.println("name: "+pr.getName());
		//System.out.println("name: "+pr.getLt().getbrand());
	}

}

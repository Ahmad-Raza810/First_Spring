package com.ahmad.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ahmad.beans2.Customer;

public class Main2 {
	public static void main(String[] args) {
		ApplicationContext container= new ClassPathXmlApplicationContext("/com/ahmad/resources/config2.xml");
         Customer c1=container.getBean("c1",Customer.class);
    
		System.out.println("Name:"+c1.getName());
		System.out.println("Account Id:"+c1.getAc().getAccId());
		System.out.println("Balance: "+c1.getAc().getBalance());
	
	}

}

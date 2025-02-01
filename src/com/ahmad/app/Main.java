package com.ahmad.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.ahmad.beans.Student;

public class Main {
	public static void main(String[] args) {
		//creating resource based on file
		Resource rs=new ClassPathResource("/com/ahmad/resources/config(bF).xml");
		BeanFactory bean=new XmlBeanFactory(rs);
		Student s=(Student)bean.getBean("stu1");
		
		System.out.println("name: "+s.getName()+"\nrollno: "+s.getRollno());
	}

}

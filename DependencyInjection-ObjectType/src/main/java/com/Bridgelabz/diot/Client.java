package com.Bridgelabz.diot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml file loaded");
		Student student = context.getBean("std", Student.class);
		student.cheating();
		AnotherStudent anotherstudent = context.getBean("anotherstd", AnotherStudent.class);
		anotherstudent.cheating();
	}
}

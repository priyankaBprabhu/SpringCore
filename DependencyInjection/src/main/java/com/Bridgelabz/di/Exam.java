package com.Bridgelabz.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main (String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student priya = context.getBean("priya", Student.class);
		priya.displayStudentInfo();
		Student ambika = context.getBean("ambika", Student.class);
		ambika.displayStudentInfo();
	}

}

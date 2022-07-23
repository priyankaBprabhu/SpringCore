package com.bl.common.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
//		ApplicationContext context = new AnnotationConfigApplicationContext(CollageConfig.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollageConfig.class);
		Student student = context.getBean("collegeBean", Student.class);
		student.displayInfo();
//		((AnnotationConfigApplicationContext)context).close();
		context.close();
		
	}
}

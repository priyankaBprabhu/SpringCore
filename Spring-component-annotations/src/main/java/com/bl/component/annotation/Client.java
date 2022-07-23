package com.bl.component.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
//		ApplicationContext context = new AnnotationConfigApplicationContext(CollageConfig.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollageConfig.class);
		College college = context.getBean("college", College.class);
		college.displayInfo();
//		((AnnotationConfigApplicationContext)context).close();
		context.close();
		
	}
}

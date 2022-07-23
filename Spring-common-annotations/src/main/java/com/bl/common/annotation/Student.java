package com.bl.common.annotation;

import org.springframework.stereotype.Component;

@Component("std")
public class Student {
	public void displayInfo() {
		System.out.println("object is created using @Component,@Configuration and @ComponentScan annotation");
	}

}

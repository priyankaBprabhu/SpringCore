package com.bl.common.annotation;

public class Student {
	private Principal principal;
	
	
	public Student(Principal principal) {
		this.principal = principal;
	}


	public void displayInfo() {
		principal.principalInfo();
		System.out.println("object is created using @Bean annotation");
	}

}

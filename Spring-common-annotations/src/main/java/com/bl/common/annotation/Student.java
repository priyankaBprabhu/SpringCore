package com.bl.common.annotation;

public class Student {
	private Principal principal;

	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("This is principle setter method");
	}

	public void displayInfo() {
		principal.principalInfo();
		System.out.println("object is created using @Bean annotation");
	}

}

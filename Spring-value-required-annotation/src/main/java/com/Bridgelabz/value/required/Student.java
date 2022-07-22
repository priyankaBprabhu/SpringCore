package com.Bridgelabz.value.required;

import org.springframework.beans.factory.annotation.Value;

public class Student  {
	@Value("${Student.name}")
	private String name;
	
	@Value("${Student.intrestedCourse}")
	private String intrestedCourse;
	
	@Value("${Student.hobby}")
	private String hobby;
	
	public void displayStudentInfo() {
		System.out.println("Student name " + name);
		System.out.println("Student intrested course " + intrestedCourse);
		System.out.println("Student hobby " + hobby);
	}

	

}

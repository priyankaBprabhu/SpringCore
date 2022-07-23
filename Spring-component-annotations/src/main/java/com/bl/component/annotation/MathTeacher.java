package com.bl.component.annotation;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("I am a Maths Teacher");
		System.out.println("My name is priya");
	}

}

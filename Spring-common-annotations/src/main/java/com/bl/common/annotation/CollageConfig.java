package com.bl.common.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollageConfig {
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	@Bean
	public Teacher mathteacher() {
		return new MathTeacher();
	}
	@Bean
	public College collegeBean() {
		College college = new College();
		college.setPrincipal(principalBean());
		college.setTeacher(mathteacher());
		return college;
//		or return new student;
	}

}

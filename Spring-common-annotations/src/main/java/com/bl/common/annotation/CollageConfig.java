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
	public Student collegeBean() {
		Student student = new Student();
		student.setPrincipal(principalBean());
		return student;
//		or return new student;
	}

}

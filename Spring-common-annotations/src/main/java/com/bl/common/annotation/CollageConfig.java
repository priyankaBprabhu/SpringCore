package com.bl.common.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollageConfig {
	@Bean
	public Student collegeBean() {
		Student student = new Student();
		return student;
//		or return new student;
	}

}

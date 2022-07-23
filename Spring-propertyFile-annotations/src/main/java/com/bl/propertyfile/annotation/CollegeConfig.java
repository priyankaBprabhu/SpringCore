package com.bl.propertyfile.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.bl.propertyfile.annotation")
@PropertySource("classpath:college-info-properties")
public class CollegeConfig {
//	@Bean
//	public Principal principalBean() {
//		return new Principal();
//	}
//	@Bean
//	public Teacher mathteacher() {
//		return new MathTeacher();
//	}
//	@Bean
//	public College collegeBean() {
//		College college = new College();
//		college.setPrincipal(principalBean());
//		college.setTeacher(mathteacher());
//		return college;
////		or return new student;
//	}

}

package com.bl.propertyfile.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	@Value("${college.collegeName}")
	private String collegeName;
	@Autowired
	private Principal principal;
	@Autowired
	private Teacher teacher;

//	public void setPrincipal(Principal principal) {
//		this.principal = principal;
//	}
//
//	public void setTeacher(Teacher teacher) {
//		this.teacher = teacher;
//	}

	public void displayInfo() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("College Name is "+collegeName);
		System.out.println("object is created using property file and annotation");
	}

}

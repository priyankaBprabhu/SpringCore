package com.bl.component.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	@Value("JIT")
	private String collageName;
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
		System.out.println("College Name is "+collageName);
		System.out.println("object is created using @Bean annotation");
	}

}

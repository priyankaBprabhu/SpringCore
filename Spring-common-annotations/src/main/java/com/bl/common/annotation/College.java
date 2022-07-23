package com.bl.common.annotation;

public class College {
	private Principal principal;
	private Teacher teacher;

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void displayInfo() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("object is created using @Bean annotation");
	}

}

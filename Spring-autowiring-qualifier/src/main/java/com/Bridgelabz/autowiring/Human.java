package com.Bridgelabz.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	/*
	 * if we use anotation before dependency obeject, no need to write setter and
	 * constructor methods
	 */
	@Autowired
	@Qualifier("octopusObject")
	private Heart heart;
	
	public void startPumping() {
		if(heart != null) {
			heart.pump();
			System.out.println("Name of the Animal " + heart.getAnimalName() + 
					" number of Hearts " + heart.getNoOfHearts());
		}else {
			System.out.println("Dead");
		}
	}

}

package com.Bridgelabz.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	private Heart heart;
	
	public Human() {
		
	}
	
	public Human(Heart heart) {
		this.heart = heart;
	}
	@Autowired
	@Qualifier("humanObject")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

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

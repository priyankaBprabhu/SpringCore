package com.Bridgelabz.autowiring;

public class Heart {
	private String animalName;
	private int noOfHearts;
	
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getAnimalName() {
		return animalName;
	}

	public int getNoOfHearts() {
		return noOfHearts;
	}
	public void setNoOfHearts(int noOfHearts) {
		this.noOfHearts = noOfHearts;
	}


	public void pump() {
		System.out.println("Heart is pumping");
		System.out.println("life");
	}
}

package com.Bridgelabz.losecoupling;

public class Student  {
	private int id;
	private ICheat cheat;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setCheat(ICheat cheat) {
		this.cheat = cheat;
	}

	public void cheating() {
		cheat.cheat();
		System.out.println("The id is " + id + " this guy is cheating");
	}

	

}

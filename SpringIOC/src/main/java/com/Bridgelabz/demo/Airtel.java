package com.Bridgelabz.demo;

public class Airtel implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling using airtel mobile");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using airtel sim");
		
	}

}

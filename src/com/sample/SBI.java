package com.sample;

public class SBI extends Bank {

	
	public float interestrate(int amount) {
		
		float r = (amount * 5)/100 + amount;
		return r;
	}
}

package com.meritamerica.assignment3;

public class CDOffering {
	
	
	private int term;
	private double interestRate;
	
	CDOffering(int term, double interestRate) {
		//constructs the CDOffering
		this.term = term;
		this.interestRate = interestRate;
				
	}
	
	int getTerm() {
		return term;
	}
	
	double getInterestRate() {
		return interestRate;
	}
	
	
}
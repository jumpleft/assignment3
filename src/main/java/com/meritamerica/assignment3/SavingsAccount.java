package com.meritamerica.assignment3;

public class SavingsAccount extends BankAccount {
	
public static final double savingsInterestRate = 0.01;
	
	
	public SavingsAccount(double startBalance){
		
		super(startBalance , savingsInterestRate);
	}	
	
	
	
	
}

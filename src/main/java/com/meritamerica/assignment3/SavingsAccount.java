package com.meritamerica.assignment3;

public class SavingsAccount extends BankAccount {
	
public static final double savingsInterestRate = 0.01;
	
	
	public SavingsAccount(double startBalance){
		
		super(startBalance , savingsInterestRate);
	}	
	
	static SavingsAccount readFromString(String accountData) { 
		//throws ParseException
		//Should throw a java.lang.NumberFormatException if String cannot be correctly parsed

	}
	
}

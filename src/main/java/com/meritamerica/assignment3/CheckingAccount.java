package com.meritamerica.assignment3;

public class CheckingAccount extends BankAccount {
	
	public static final double checkingInterestRate = 0.0001;
	
	
	public CheckingAccount(double startBalance){
		
		super(startBalance , checkingInterestRate);
	}
	
}

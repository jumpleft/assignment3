package com.meritamerica.assignment3;

public class BankAccount {

	private double balance;
	private double intrestRate;
	//private double futureBalance;
	private long accountNumber;
	private java.util.Date openedOn;
	
	public BankAccount(double balance, double interestRate) {
		
		this.balance = balance;
		this.intrestRate = interestRate;
		this.accountNumber = MeritBank.getNextAccountNumber();
		this.openedOn = new java.util.Date();
		
		
	}
	
	public BankAccount(double balance, double interestRate, java.util.Date accountOpenedOn) {
		
		this.balance = balance;
		this.intrestRate = interestRate;
		this.accountNumber = MeritBank.getNextAccountNumber();
		this.openedOn = accountOpenedOn;
		
	}
	
	public BankAccount(long accountNumber, double balance, double interestRate, java.util.Date accountOpenedOn) {
		
		this.balance = balance;
		this.intrestRate = interestRate;
		this.accountNumber = accountNumber;
		this.openedOn = accountOpenedOn;
		
	}
	
	
	
	
	

    //setters and getters 
	public java.util.Date getOpenedOn() {
		return openedOn;
	}
	
	
	public long getAccountNumber() {
		return accountNumber;		
	}
	
	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getIntrestRate() {
		return intrestRate;
	}


	public void setIntrestRate(double intrestRate) {
		this.intrestRate = intrestRate;
	}
	
	
	//methods
	boolean withdraw(double amount) {
		if (getBalance() >= amount) {
			setBalance(getBalance()-amount);
			return true;
		}else{
			return false;
		}
			
	}
	
	boolean deposit(double amount) {
		setBalance(getBalance()+amount);
		return true;
		
	}

		
	public String toString() {
		return ("");
	}

	public double FutureValue(int years) {
			
			double p = balance;
			double i = intrestRate;
			int n = years;
			double future = p*(Math.pow((1+i),n));
			return future;
					
	}
	
	static BankAccount readFromString(String accountData) {
		//throws ParseException 
		//Should throw a java.lang.NumberFormatException if String cannot be correctly parsed
		
		
		
	}
	
	public String writeToString() {
		StringBuilder sb = new StringBuilder(accountNumber + "," + balance + "," + intrestRate + "," + openedOn);
		String toBeReturned = sb.toString();
		return toBeReturned;
	}
			
			

	
	
	
	/*
    public void setFutureValue(int years) {
		
		double p = balance;
		double i = intrestRate;
		int n = years;
		double future = p*(Math.pow((1+i),n));
		futureBalance = future;
				
    }
    
    public double getFutureValue() {
    	return futureBalance;
    }
    
    public double getFutureValue(int years) {
    	setFutureValue(years);
    	return futureBalance;
    }
    */
 
    
				
}

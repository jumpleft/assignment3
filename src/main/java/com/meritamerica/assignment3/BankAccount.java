package com.meritamerica.assignment3;

public class BankAccount {

	private double balance;
	private double intrestRate;
	private double futureBalance;
	private double accountNumber;
	
	public BankAccount(double balance, double intrestRate) {
		
		this.balance = balance;
		this.intrestRate = intrestRate;
		this.accountNumber = MeritBank.getNextAccountNumber();
		
	}

    //setters and getters 
	public double getAccountNumber() {
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
    
 
    
				
}

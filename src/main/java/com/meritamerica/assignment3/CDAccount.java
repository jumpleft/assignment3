package com.meritamerica.assignment3;

public class CDAccount extends BankAccount {
	
	private int Term;
	
	
	public CDAccount(CDOffering offering , double openingBalance) {
		super(openingBalance , offering.getInterestRate());
		this.Term = offering.getTerm();
	}
	
	
     public void setFutureValue() {
	    super.FutureValue(Term);	
				
     }
     
     boolean withdraw(double amount) {
    	 return false;
     }
     
     boolean deposit(double amount) {
    	 return false;
     }
     
     static CDAccount readFromString(String accountData) { 
    	 //throws ParseException
    	 //Should throw a java.lang.NumberFormatException if String cannot be correctly parsed

     }
     //Override writeToString method to include term
     public String writeToString() {
 		StringBuilder sb = new StringBuilder(getAccountNumber() + "," + getBalance() + "," + Term + "," + getIntrestRate() + "," + getOpenedOn());
 		String toBeReturned = sb.toString();
 		return toBeReturned;
 	}
     
}
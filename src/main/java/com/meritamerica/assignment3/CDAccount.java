package com.meritamerica.assignment3;

public class CDAccount extends BankAccount {
	
	private int Term;
	
	
	public CDAccount(CDOffering offering , double openingBalance) {
		super(openingBalance , offering.getInterestRate());
		this.Term = offering.getTerm();
	}
	
	
     public void setFutureValue() {
	    super.setFutureValue(Term);	
				
     }
	
}
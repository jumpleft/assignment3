package com.meritamerica.assignment3;

public class MeritBank {
	
	public static AccountHolder[] accountHolders;
	public static CDOffering[] CDOfferings;
	public static long nextAccountNumber = 12345000;
	
	
	
	static void addAccountHolder(AccountHolder accountHolder){
		if(accountHolders == null){
			AccountHolder[] freshstart = {accountHolder};
			accountHolders = freshstart;
		}else{
			AccountHolder[] temp = new  AccountHolder[accountHolders.length + 1];
			for(int i = 0 ; i < accountHolders.length ; i++){
				temp[i] = accountHolders[i];
			}
			temp[accountHolders.length + 1] = accountHolder;
				
		}		
	}
	
	
	static AccountHolder[] getAccountHolders(){
		return accountHolders;
	}
	
	
	static CDOffering[] getCDOfferings(){
		return CDOfferings;
	}
	
	
	//static CDOffering getBestCDOffering(double depositAmount){}
	
	
	//static CDOffering getSecondBestCDOffering(double depositAmount){}
	
	
	static void clearCDOfferings(){
		CDOfferings = null;
	}
	
	
	static void setCDOfferings(CDOffering[] offerings){
		if(CDOfferings == null){
			CDOfferings = offerings;
		}else{
			
			CDOffering[] temp = new  CDOffering[CDOfferings.length + offerings.length];
			
			for(int i = 0 ; i < CDOfferings.length ; i++){
				temp[i] = CDOfferings[i];
			}
			
			for(int i = CDOfferings.length ; i < CDOfferings.length + offerings.length ; i++){
			    temp[i] = offerings[i - CDOfferings.length];
			}
			CDOfferings = temp;
		}
				
	}
	
	
	static long getNextAccountNumber(){
		nextAccountNumber++;
		return nextAccountNumber;
	}
	
	
	//static double totalBalances(){}
	
	
	//static double futureValue(double presentValue, double interestRate, int term){}

	
	

}

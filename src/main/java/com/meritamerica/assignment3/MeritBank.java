package com.meritamerica.assignment3;

import java.io.*;


public class MeritBank {
	
	public static AccountHolder[] accountHolders;
	public static CDOffering[] CDOfferings;
	public static long nextAccountNumber = 12345001;
	
	
	
	
	static boolean readFromFile(String fileName) {
		try {
			BufferedReader bufRead = new BufferedReader(new FileReader(fileName));
			
			String line;
			
			while ((line = bufRead.readLine()) != null) {
				//need to change this part
				System.out.println(line);
			}
			bufRead.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	
	static boolean writeToFile(String fileName) {
		try {
			
			BufferedWriter bufWrite = new BufferedWriter(new FileWriter(fileName));
			StringBuilder lastSB = new StringBuilder(nextAccountNumber + "\n" + CDOfferings.length + "\n");
			for(CDOffering cdO : CDOfferings){
				lastSB.append(cdO.writeToString() + "\n");
			}
			lastSB.append(accountHolders.length + "\n");
			for(AccountHolder sbac : accountHolders) {
				lastSB.append(sbac.writeToString() + "\n");
			}
			String toBeWritten = lastSB.toString();
			
			//put writer here
			bufWrite.write(toBeWritten);
			
			bufWrite.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
	}

	
	
	
	
	
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
	
	public static AccountHolder[] sortAccountHolders() {
		return accountHolders = AccountHolder.sortAccounts(accountHolders);
		
	}
	
	public static CDOffering[] getCDOfferings(){
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
		long tempNAC = nextAccountNumber;
		nextAccountNumber++;
		return tempNAC;
	}
	
	public static void setNextAccountNumber(long nextAccountNumbe) {
		nextAccountNumber = nextAccountNumbe;
		
	}
	
	
	//static double totalBalances(){}
	
	
	//static double futureValue(double presentValue, double interestRate, int term){}

	
	

}

package com.meritamerica.assignment3;

public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private BankAccount[] bankAccounts ;
	
	
	
	
	//need to adjust this to suit the calls when I find out what they are.
	

	public AccountHolder (String firstName, String middleName, String lastName, String ssn , BankAccount starterBankAccount){
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		BankAccount[] ba = {starterBankAccount};
		this.bankAccounts = ba; 
		
	}
	
    public AccountHolder (String firstName, String middleName, String lastName, String ssn , BankAccount starterBankAccount , BankAccount seccountBankAccount){
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		BankAccount[] ba = {starterBankAccount , seccountBankAccount};
		this.bankAccounts = ba; 
    }
	
	
	
	
	
	public void setBankAccounts(BankAccount[] BA){
		if(bankAccounts == null){
			bankAccounts = BA;			
		}else{
			BankAccount[] temp = new BankAccount[bankAccounts.length + BA.length];
			for(int i = 0 ; i < bankAccounts.length ; i++){
				temp[i] = bankAccounts[i];
			}
			for(int i = bankAccounts.length ; i < bankAccounts.length + BA.length ; i++){
				temp[i] = BA[i - bankAccounts.length];
			}
			bankAccounts = temp;
		}
		
		
	}
	
	public BankAccount[] getBankAccounts() {
		return bankAccounts;
	}
	
		
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;}
	
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}
	
	public String getLastName() {
		return lastName;
	}
	
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

	public String getSSN(){
		return ssn;
	}


    public String toString() {
		
		return  "============================================"+ 
				"\nName: " + firstName + " " + middleName + " " + lastName + 
				"\nSocial Secuurity Number: " + ssn +
				"\n============================================" + "\n"; 
	}
	
}

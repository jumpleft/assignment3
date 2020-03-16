package com.meritamerica.assignment3;

public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private BankAccount[] bankAccounts ;
	
	
	
	
	//need to adjust this to suit the calls when I find out what they are.
	public AccountHolder(){}
	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		CheckingAccount CA1 = new CheckingAccount(checkingAccountOpeningBalance);
		SavingsAccount SA1 = new SavingsAccount(savingsAccountOpeningBalance);
		BankAccount[] ba = {CA1 , SA1};
		this.bankAccounts = ba;
		
	}


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
	
	
	
	public double getHoldersTotal() {
		double holdersTotal = 0;
		for(int i = 0 ; i < bankAccounts.length ; i++){
			holdersTotal += bankAccounts[i].getBalance();
		}
		return holdersTotal;
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
	
	public static AccountHolder[] sortAccounts(AccountHolder[] toBeSorted) {
		AccountHolder tempAH; 
		
		for(int i = 0 ; i < toBeSorted.length ; i++) {
			for(int j = i + 1 ; j < toBeSorted.length ; j++) {
				if(toBeSorted[i].getHoldersTotal() > toBeSorted[j].getHoldersTotal()) {
					tempAH = toBeSorted[i];
					toBeSorted[i] = toBeSorted[j];
					toBeSorted[j] = tempAH;
					
				}
			}
		}
		return toBeSorted;
		
	}
	
	public String writeToString() {
		StringBuilder holderSB = new StringBuilder(firstName + "," + middleName + "," + lastName + "," + ssn + "\n");
		
		int counterCA = 0;
		int counterSA = 0;
		int counterCDA = 0;
	
		
		
		for(BankAccount ba : bankAccounts) {
						
			Class<? extends BankAccount> c = ba.getClass();
			if(c == CheckingAccount.class) {				
				counterCA++;
			}else if(c == SavingsAccount.class) {				
				counterSA++;
			}else if(c == CDAccount.class) {				
				counterCDA++;
			}
		}
		holderSB.append(counterCA + "\n");		
		
		for(BankAccount ba : bankAccounts) {
			
			Class<? extends BankAccount> c = ba.getClass();
			if(c == CheckingAccount.class) {
				holderSB.append(ba.writeToString() + "\n");				
			}					
		}
		holderSB.append(counterSA + "\n");
		
        for(BankAccount ba : bankAccounts) {
			
			Class<? extends BankAccount> c = ba.getClass();
			if(c == SavingsAccount.class) {
				holderSB.append(ba.writeToString() + "\n");				
			}
        }
        holderSB.append(counterCDA + "\n");
		
        for(BankAccount ba : bankAccounts) {
			
			Class<? extends BankAccount> c = ba.getClass();
			if(c == CDAccount.class) {
				holderSB.append(ba.writeToString() + "\n");				
			}
        }
                	
		String toBeReturned = holderSB.toString();
		return toBeReturned;
	}
	


    
	
}

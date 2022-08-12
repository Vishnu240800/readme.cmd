package com.training.model;

import com.training.BankAccount;

public class SavingsAccount extends BankAccount {
	
	private String nominee;
	
	
	public String getNominee() {
		return nominee;
	}


	public void setNominee(String nominee) {
		this.nominee = nominee;
	}


	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType,String nominee) {
		super(accountNumber,accountHolderName,balance,accountType);
		this.nominee=nominee;
	}
	
	//when ever sub class constructor is called its super class constructor also called
	//even if super () key word is not present
	
//	public SavingsAccount() {
//		super();
//		System.out.println("CONSTRUCTOR OF SUBCLASS CALLED");
//			
//		
//	}

	
//	public SavingsAccount() {
//		
//		
//		super(3546,"Hello",747834);
//		System.out.println("CONSTRUCTOR OF SUBCLASS CALLED");
//	}
	
	
}

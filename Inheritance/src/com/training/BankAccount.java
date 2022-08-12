package com.training;

public class BankAccount {
	
	private int accountNumber;
	private String accountHolderName;
	private double  balance;
	
	private String accountType;
	
	public BankAccount(String accountType) {
		super();
		this.accountType = accountType;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.accountNumber +","+this.accountHolderName+","+this.balance+","+this.accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public BankAccount() {
		super();
		
		System.out.println("zero argument construtor");
	}
	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		super();
		System.out.println("THREE argument construtor");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public BankAccount(int accountNumber, String accountHolderName, double balance, String accountType) {
		super();
		System.out.println("FOUR argument construtor");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
		
	}
	
	

	
	

}
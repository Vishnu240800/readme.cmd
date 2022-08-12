package com.example.ifaces;

public class LoanApplication {
	
	
	private int loan_Application_Number;
	private Customer customer;
	private double loan_Amount;
	
	public int getLoan_Application_Number() {
		return loan_Application_Number;
	}
	
	public void setLoan_Application_Number(int loan_Application_Number) {
		this.loan_Application_Number = loan_Application_Number;
	}

	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public double getLoan_Amount() {
		return loan_Amount;
	}
	
	public void setLoan_Amount(double loan_Amount) {
		this.loan_Amount = loan_Amount;
	}
	@Override
	public String toString() {
		return "LoanApplication [loan_Application_Number=" + loan_Application_Number + ", customer=" + customer
				+ ", loan_Amount=" + loan_Amount + "]";
	}
	public LoanApplication(int loan_Application_Number, Customer customer, double loan_Amount) {
		super();
		this.loan_Application_Number = loan_Application_Number;
		this.customer = customer;
		this.loan_Amount = loan_Amount;
	}
	public LoanApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}

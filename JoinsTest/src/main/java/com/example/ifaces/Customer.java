package com.example.ifaces;

public class Customer {
	
	private int customer_Id;
	private String customer_Name;
	private long phone_Number;
	private double credit_Score;
	
	
	public int getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(int customer_Id) {
		this.customer_Id = customer_Id;
	}
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	public long getPhone_Number() {
		return phone_Number;
	}
	public void setPhone_Number(long phone_Number) {
		this.phone_Number = phone_Number;
	}
	public double getCredit_Score() {
		return credit_Score;
	}
	public void setCredit_Score(double credit_Score) {
		this.credit_Score = credit_Score;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customer_Id, String customer_Name, long phone_Number, double credit_Score) {
		super();
		this.customer_Id = customer_Id;
		this.customer_Name = customer_Name;
		this.phone_Number = phone_Number;
		this.credit_Score = credit_Score;
	}
	@Override
	public String toString() {
		return "Customer [customer_Id=" + customer_Id + ", customer_Name=" + customer_Name + ", phone_Number="
				+ phone_Number + ", credit_Score=" + credit_Score + "]";
	}

}

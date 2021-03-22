package com.revature.project.model;

public class Account {

	private int accountNum;
	private float balance;
	private Customer customer;
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accountNum, float balance) {	//take accountNum out of the parameters list after auto generating
		super();
		this.accountNum = accountNum; // auto generate accountNum
		this.balance = balance;
	}

	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {	// might auto generate in here. possibly might take away
		this.accountNum = accountNum;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float d) {
		this.balance = d;
	}
	
	
	
	
}

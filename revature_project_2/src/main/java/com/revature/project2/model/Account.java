package com.revature.project2.model;

public class Account {
	
	private int accountNum;
	private float balance;
	private String status;
	private Customer customer;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accountNum, float balance, String status, Customer customer) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
		this.status = status;
		this.customer = customer;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	
	@Override
	public String toString() {
		return "Account [accountNum=" + accountNum + ", balance=" + balance + ", status=" + status + ", customer="
				+ customer + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNum;
		result = prime * result + Float.floatToIntBits(balance);
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountNum != other.accountNum)
			return false;
		if (Float.floatToIntBits(balance) != Float.floatToIntBits(other.balance))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	
	
	
}

package com.revature.project2.dao;

import com.revature.project2.exception.BankException;
import com.revature.project2.model.Account;


public interface CustomerSearchDao {

	public Account getCustomerAccount(int custid) throws BankException;
	public int getBalance(int accountNum, int custid)throws BankException;
}

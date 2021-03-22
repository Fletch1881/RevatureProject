package com.revature.project2.service;

import com.revature.project2.exception.BankException;
import com.revature.project2.model.Account;

public interface CustomerSearchService {

	public Account getCustomerAccount(int custid) throws BankException;
	public int getBalance(int accountNum, int custid)throws BankException;
}

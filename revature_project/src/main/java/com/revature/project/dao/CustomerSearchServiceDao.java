package com.revature.project.dao;

import java.util.List;

import com.revature.project.exception.BankException;
import com.revature.project.model.Account;

public interface CustomerSearchServiceDao {

	public Account getCustomerAccount(int custid) throws BankException;
	public float getBalance(int accountNum, int custid)throws BankException;
}

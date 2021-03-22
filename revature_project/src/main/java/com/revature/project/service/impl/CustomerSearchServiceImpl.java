package com.revature.project.service.impl;

import java.util.List;

import com.revature.project.dao.CustomerSearchServiceDao;
import com.revature.project.dao.impl.CustomerSearchServiceDaoImpl;
import com.revature.project.exception.BankException;
import com.revature.project.model.Account;
import com.revature.project.service.CustomerSearchService;

public class CustomerSearchServiceImpl implements CustomerSearchService{

	private CustomerSearchServiceDao customerservicedao = new CustomerSearchServiceDaoImpl();
	@Override
	public Account getCustomerAccount(int custid) throws BankException{
		Account account = null;
		//validations go here
		account = customerservicedao.getCustomerAccount(custid);
		
		return account;
	}

	@Override
	public float getBalance(int accountNum, int custid) throws BankException {
		
		
		float balance = customerservicedao.getBalance(accountNum, custid);
		
		return balance;
	}

	
	
}

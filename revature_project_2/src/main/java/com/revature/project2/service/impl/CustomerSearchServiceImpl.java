package com.revature.project2.service.impl;

import com.revature.project2.dao.CustomerSearchDao;
import com.revature.project2.dao.impl.CustomerSearchDaoImpl;
import com.revature.project2.exception.BankException;
import com.revature.project2.model.Account;
import com.revature.project2.service.CustomerSearchService;

public class CustomerSearchServiceImpl implements CustomerSearchService{
	
	private CustomerSearchDao customerservicedao = new CustomerSearchDaoImpl();

	@Override
	public Account getCustomerAccount(int custid) throws BankException {
		Account account = null;
		//validations go here
		account = customerservicedao.getCustomerAccount(custid);
		
		return account;
	}

	@Override
	public int getBalance(int accountNum, int custid) throws BankException {
		// TODO Auto-generated method stub
		return 0;
	}

}

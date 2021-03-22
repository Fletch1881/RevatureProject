package com.revature.project2.dao;

import com.revature.project2.exception.BankException;

public interface LoginDao {

	public boolean checkEmpLoginInfo(int id, String pw) throws BankException;
	public boolean checkCustLoginInfo(int id, String pw) throws BankException;
}

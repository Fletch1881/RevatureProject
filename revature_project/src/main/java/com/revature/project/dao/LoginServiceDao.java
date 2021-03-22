package com.revature.project.dao;

import com.revature.project.exception.BankException;

public interface LoginServiceDao {

	public boolean checkEmpLoginInfo(int id, String pw) throws BankException;
	public boolean checkCustLoginInfo(int id, String pw) throws BankException;
}

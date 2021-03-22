package com.revature.project2.service;

import com.revature.project2.exception.BankException;

public interface LoginService {

	public boolean checkEmpLoginInfo(int id, String pw) throws BankException;
	public boolean checkCustLoginInfo(int id, String pw) throws BankException;
}

package com.revature.project.service;

import com.revature.project.exception.BankException;

public interface LoginService {
	
	public boolean checkEmpLoginInfo(int id, String pw) throws BankException;
	public boolean checkCustLoginInfo(int id, String pw) throws BankException;
}

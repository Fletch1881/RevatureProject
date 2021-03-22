package com.revature.project2.service.impl;

import com.revature.project2.dao.LoginDao;
import com.revature.project2.dao.impl.LoginDaoImpl;
import com.revature.project2.exception.BankException;
import com.revature.project2.service.LoginService;

public class LoginServiceImpl implements LoginService{

	LoginDao logindao = new LoginDaoImpl();
	@Override
	public boolean checkEmpLoginInfo(int id, String pw) throws BankException {
		
		if(logindao.checkEmpLoginInfo(id, pw)) {
			return true;
		}else {
			return false;
		}

	}

	@Override
	public boolean checkCustLoginInfo(int id, String pw) throws BankException {
		
		if(logindao.checkCustLoginInfo(id, pw)) {
			return true;
		}else {
			return false;
		}
	}

}

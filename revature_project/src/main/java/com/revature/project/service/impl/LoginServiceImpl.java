package com.revature.project.service.impl;

import com.revature.project.dao.LoginServiceDao;
import com.revature.project.dao.impl.LoginServiceDaoImpl;
import com.revature.project.exception.BankException;
import com.revature.project.service.LoginService;

public class LoginServiceImpl implements LoginService{

	private LoginServiceDao logindao = new LoginServiceDaoImpl();
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

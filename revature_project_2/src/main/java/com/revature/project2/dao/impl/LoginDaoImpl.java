package com.revature.project2.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.revature.project2.dbutil.PostgresConnection;
import com.revature.project2.dao.LoggerDao;
import com.revature.project2.dao.LoginDao;
import com.revature.project2.exception.BankException;

public class LoginDaoImpl implements LoginDao{

	
	private static Logger log = Logger.getLogger(LoggerDao.class);
	@Override
	public boolean checkEmpLoginInfo(int id, String pw) throws BankException {
		try(Connection connection = PostgresConnection.getConnection()){
			String sql = "select employee.empid, employee.mypass from bank_schema.employee where bank_schema.employee.empid = ? and bank_schema.employee.mypass = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, pw);
			
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {
				//log.info("Test from login dao impl");
				int empid = rs.getInt("empid");
				String pass = rs.getString("mypass");
				if(id == empid && pass.equals(pw)) {
					return true;
				}else {
					return false;
				}
				
			}
		}catch(SQLException | ClassNotFoundException e) {
			log.debug(e);
			throw new BankException("Interanl Error");
		}
		return false;
	}

	@Override
	public boolean checkCustLoginInfo(int id, String pw) throws BankException {
		try(Connection connection = PostgresConnection.getConnection()){
			String sql = "select customer.custid, customer.mypass from bank_schema.customer where bank_schema.customer.custid = ? and bank_schema.customer.mypass = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, pw);
			
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {
				int custid = rs.getInt("custid");
				String pass = rs.getString("mypass");
				if(id == custid && pw.contentEquals(pass)) {
					return true;
				}else {
					return false;
				}
				
			}
		}catch(SQLException | ClassNotFoundException e) {
			log.debug(e);
			throw new BankException("Interanl Error");
		}
		return false;
	}

}

package com.revature.project.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.revature.project.dao.CustomerSearchServiceDao;
import com.revature.project.dao.LoggerDao;
import com.revature.project.dbutil.PostgresConnection;
import com.revature.project.exception.BankException;
import com.revature.project.model.Account;

public class CustomerSearchServiceDaoImpl implements CustomerSearchServiceDao{
	
	private static Logger log = Logger.getLogger(LoggerDao.class);
	
	@Override
	public Account getCustomerAccount(int custid) throws BankException{
		Account account = null;
		
		try(Connection connection = PostgresConnection.getConnection()){
			String sql = "select account.accountNum, account.balance from bank_schema.account join bank_schema.customer on bank_schema.account.custid = bank_schema.customer.custid where bank_schema.account.custid = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, custid);
			
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {
				account = new Account();
				account.setAccountNum(rs.getInt("accountnum"));
				account.setBalance(rs.getInt("balance"));
			}
			if(account == null) {
				throw new BankException("No account with customer id: "+custid);
			}
		}catch(SQLException | ClassNotFoundException e) {
			log.debug(e);
			throw new BankException("Interanl Error");
		}
		
		return account;
	}

	@Override
	public float getBalance(int accountNum, int custid) throws BankException{
		
		float balance = 0.0f;
		
		try(Connection connection = PostgresConnection.getConnection()){
			String sql = "select account.balance from bank_schema.account join bank_schema.customer on bank_schema.account.custid = bank_schema.customer.custid where bank_schema.account.custid = ? and bank_schema.account.accountnum = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, custid);
			preparedStatement.setInt(2,  accountNum);
			
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {
				balance = rs.getInt("balance");
			}	
			if(balance == 0.0) {
				throw new BankException("No account with account number "+accountNum+" and matching cutstomer id "+custid);
			}
		}catch(SQLException | ClassNotFoundException e) {
			log.debug(e);
			throw new BankException("Interanl Error");
		}
		return balance;
	}

}

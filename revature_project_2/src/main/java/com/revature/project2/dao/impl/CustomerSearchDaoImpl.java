package com.revature.project2.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.revature.project2.dao.LoggerDao;
import com.revature.project2.dbutil.PostgresConnection;
import com.revature.project2.dao.CustomerSearchDao;
import com.revature.project2.exception.BankException;
import com.revature.project2.model.Account;

public class CustomerSearchDaoImpl implements CustomerSearchDao{

	private static Logger log = Logger.getLogger(LoggerDao.class);
	
	@Override
	public Account getCustomerAccount(int custid) throws BankException {
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
			log.info("test");
		}catch(SQLException | ClassNotFoundException e) {
			log.debug(e);
			throw new BankException("Interanl Error");
		}
		
		return account;
	}

	@Override
	public int getBalance(int accountNum, int custid) throws BankException {
		// TODO Auto-generated method stub
		return 0;
	}

}

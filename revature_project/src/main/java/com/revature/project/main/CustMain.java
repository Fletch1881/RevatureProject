package com.revature.project.main;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.project.exception.BankException;
import com.revature.project.model.Account;
import com.revature.project.service.CustomerSearchService;
import com.revature.project.service.impl.CustomerSearchServiceImpl;


public class CustMain {

	private static Logger log=Logger.getLogger(Main.class);
	
	public static void custOptions(int custid) throws BankException{
	
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		CustomerSearchService customerService = new CustomerSearchServiceImpl();
		
		
		do {
			log.info("Choose what you want to do: ");
			log.info("1) Apply for a new bank account **under construction**");
			log.info("2) View balance of account");
			log.info("3) Withdrawl from account **under construction**");
			log.info("4) Deposit to account **under construction**");
			log.info("5) Money transfer to account **under construction**");
			log.info("6) Accept/Reject money transfers **under construction**");
			log.info("7) Exit");
			
			try {
				choice = Integer.parseInt(scanner.nextLine());
			}catch(NumberFormatException e){}
			
			switch(choice) {
			case 1:
				
				break;
			case 2:
				int accNum;
				log.info("Please enter the account number to which you want to view your account balance");
				try {
					accNum = Integer.parseInt(scanner.nextLine());
					float a = customerService.getBalance(accNum, custid);
					log.info("Account Number: "+accNum);
					log.info("Account Balance: "+a);
				}catch(NumberFormatException e ) {}
				
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				log.info("Returning to main menu\n");
				break;
			default:
				log.info("Invalid option. Only choose 1-7");
				break;
			}
			
		}while(choice!=7);
	}
}

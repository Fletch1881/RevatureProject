package com.revature.project.main;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.project.exception.BankException;
import com.revature.project.model.Account;
import com.revature.project.service.CustomerSearchService;
import com.revature.project.service.LoginService;
import com.revature.project.service.impl.CustomerSearchServiceImpl;
import com.revature.project.service.impl.LoginServiceImpl;


public class EmpMain {
	
	private static Logger log=Logger.getLogger(Main.class);
	
	public static void empOptions() throws BankException{
		
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		CustomerSearchService customerService = new CustomerSearchServiceImpl();
		
		
		do {
			log.info("Choose what you want to do: ");
			log.info("1) Accept/Reject Accounts **under construction**");
			log.info("2) View a customers account");
			log.info("3) View transactions **under construciton**");
			log.info("4) Exit");
			
			try {
				choice = Integer.parseInt(scanner.nextLine());
			}catch(NumberFormatException e){}
			
			switch(choice) {
			case 1:
				log.info("accpet/reject accounts list goes here");
				List<Account> accountList; // do the lsit stuff here
				
				break;
			case 2:
				int custid;
				log.info("Please enter the customer's id to which you want to view their account");
				try {
					custid = Integer.parseInt(scanner.nextLine());
					Account a = customerService.getCustomerAccount(custid);
					if(a != null) {
						log.info("Account Number: "+a.getAccountNum());
						log.info("Account Balance: "+a.getBalance());
					}
				}catch(NumberFormatException e ) {}
				
				
				break;
			case 3:
				log.info("transaction log goes here");
				
				break;
			case 4:
				log.info("Returning to the main menu\n");
				
				break;
			default:
				log.info("Invalid option. Only choose 1-4");
				break;
			}
			
		}while(choice!=4);

		
	}

}

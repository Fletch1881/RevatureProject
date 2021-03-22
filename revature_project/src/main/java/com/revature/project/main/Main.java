package com.revature.project.main;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.project.exception.BankException;
import com.revature.project.service.CustomerSearchService;
import com.revature.project.service.LoggerService;
import com.revature.project.service.LoginService;
import com.revature.project.service.impl.CustomerSearchServiceImpl;
import com.revature.project.service.impl.LoginServiceImpl;



public class Main {

	private static Logger log=Logger.getLogger(Main.class);
	EmpMain empmain = new EmpMain();
	public static void main(String[] args) {
		
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		LoginService loginService = new LoginServiceImpl();
		

		
		do {
			log.info("--------------------------------------\n");
			log.info("Welcome to the Banking Application\n");
			log.info("--------------------------------------\n");
			
			log.info("Please choose login type below");
			log.info("1) Employee");
			log.info("2) Customer");
			log.info("3) Register for an account");
			log.info("4) Exit\n");
			
			try {
				choice=Integer.parseInt(scanner.nextLine());
			}catch(NumberFormatException e){}
			
			switch(choice) {
			case 1:
				int empid;
				String pw;
				log.info("Please enter your employee id and password below: ");
				try {
					log.info("emplyoee id: ");
					empid = Integer.parseInt(scanner.nextLine());
				}catch(NumberFormatException e) {
					log.info("ID should be numbers only");
					break;
				}
				log.info("password: ");
				pw = scanner.nextLine();

				try {
					if(loginService.checkEmpLoginInfo(empid, pw)) {
						try {
							EmpMain.empOptions();
						} catch (BankException e) {
							log.debug(e);
						}
					}else {
						log.info("Invalid id or password");
						break;
					}
				} catch (BankException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				break;
			case 2:
				int custid;
				String custpw;
				log.info("Please enter your customer id and password below: ");
				try {
					log.info("customer id: ");
					custid = Integer.parseInt(scanner.nextLine());
				}catch(NumberFormatException e) {
					log.info("ID should be numbers only");
					break;
				}
				log.info("password: ");
				custpw = scanner.nextLine();

				try {
					if(loginService.checkCustLoginInfo(custid, custpw)) {
						try {
							CustMain.custOptions(custid);
						} catch (BankException e) {
							log.debug(e);
						}
					}else {
						log.info("Invalid id or password");
						break;
					}
				} catch (BankException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				break;
			case 3:
				log.info("Registration goes here....");		
				
				break;
			case 4:
				log.info("Goodbye!");		
				break;
			default:
				log.info("Invalid choice\n\n");
			}
			
			
			
		}while(choice != 4);
			
		
		
	}

}

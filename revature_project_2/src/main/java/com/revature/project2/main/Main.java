package com.revature.project2.main;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.project2.exception.BankException;
import com.revature.project2.service.CustomerSearchService;
import com.revature.project2.service.LoginService;
import com.revature.project2.service.impl.CustomerSearchServiceImpl;
import com.revature.project2.service.impl.LoginServiceImpl;


public class Main {

	public static void main(String[] args) {
		
		Logger log=Logger.getLogger(Main.class);

			
			int option = 0;
			Scanner scanner = new Scanner(System.in);
			LoginService loginService = new LoginServiceImpl();
			CustomerSearchService customerService = new CustomerSearchServiceImpl();

			

			
			do {
				log.info("--------------------------------------");
				log.info("Welcome to the Banking Application");
				log.info("--------------------------------------\n");
				
				log.info("Please choose login type below");
				log.info("1) Employee");
				log.info("2) Customer");
				log.info("3) Register for an account");
				log.info("4) Exit\n");
				
				try {
					option=Integer.parseInt(scanner.nextLine());
				}catch(NumberFormatException e){}
				
				switch(option) {
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
							EmpMain.empOptions();
						}else {
							log.info("Invalid password or id");
						}
					}catch(Exception e) {}
					break;
				case 2:
					/*int custid;
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
					}*/
					
					break;
				case 3:
					log.info("Registration goes here....");		
					
					break;
				case 4:
					log.info("Goodbye!");		
					break;
				default:
					option = 0;
					log.info("Invalid choice\n\n");
				}
				
				
				
			}while(option!= 4);
				
			
			
		}

	}



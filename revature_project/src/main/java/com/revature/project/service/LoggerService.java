package com.revature.project.service;

import org.apache.log4j.Logger;

import com.revature.project.dao.LoggerDao;

public class LoggerService {
	
	private static Logger log = Logger.getLogger(LoggerDao.class);
	
	private LoggerDao dao = new LoggerDao();
	
	public void helloLoggerService() {
		
		log.debug("test of debug of LoggerService");
		log.info("test info to user of LoggerService");
		
		dao.helloLoggerDAO();
		
		log.debug("end test of debug of LoggerService");
	}
}

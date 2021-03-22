package com.revature.project2.dao;

import org.apache.log4j.Logger;


public class LoggerDao {

	private static Logger log = Logger.getLogger(LoggerDao.class);
	
	public void helloLoggerDAO() {
		log.debug("test of debug of LogDAO");
		
		//something about operations here
		
		log.info("test to user of LoggerDAO");
		log.debug("end test of debug of LoggerDAO");
		
	}
}

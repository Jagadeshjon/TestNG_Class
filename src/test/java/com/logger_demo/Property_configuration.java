package com.logger_demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_configuration {
	
	
	static Logger log = Logger.getLogger(Property_configuration.class);
	

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");

		log.debug("Debug");
		log.error("Error");
		log.warn("Warning");
		log.info("Info");
		log.fatal("Fatal");
		
		
		
		
		
		
		
		
		
		

	}

}

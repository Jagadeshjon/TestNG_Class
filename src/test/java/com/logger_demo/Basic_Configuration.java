package com.logger_demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Configuration {

	static Logger log = Logger.getLogger(Basic_Configuration.class);

	public static void main(String[] args) {

		BasicConfigurator.configure();

		log.debug("Debug");
		log.error("Error");
		log.warn("Warning");
		log.info("Info");
		log.fatal("Fatal");

	}

}

package org.baseclass12345;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Domo_facebook extends New_base_class {

	// public static WebDriver driver;

	public static void main(String[] args) {

		
		
		browser_configuration("chrome");

		
        geturl("https://www.facebook.com/");
	      // value("email");
        driver.close();

	}

}

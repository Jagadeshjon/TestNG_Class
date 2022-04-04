package org.baseclass12345;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class New_base_class {
	public static WebDriver driver;
	//public static  WebDriver driver;//null driver
	// excel
	//browser launch
	public static void browser_configuration(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();

		}



	}
	public static void geturl(String url) {
		driver.get(url);
		
	}
      	public static void value(String id)
      		 {
		driver.findElement(By.id(id));

	}

    	}



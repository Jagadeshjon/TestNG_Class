package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_Fblogin {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjQ0MjE3MDM4LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3De");

		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("This is the Title of the Link:" + title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("This is the currentURL of the link:" + currentUrl);

		// sendkeys
		WebElement emailid = driver.findElement(By.id("email"));
		emailid.sendKeys("palpandiyanp361997@gmail.com");
		// isdisplayed
		boolean displayed = emailid.isDisplayed();
		System.out.println("isdisplayed:" + displayed);
		// isEnabled
		boolean enabled = emailid.isEnabled();
		System.out.println("isEnabled:" + enabled);
		// isSelected
		boolean selected = emailid.isSelected();
		System.out.println("isSelected:" + selected);
		// attribute
		String attribute = emailid.getAttribute("name");
		System.out.println(attribute);

		String attribute2 = emailid.getAttribute("value");
		System.out.println(attribute2);
		Thread.sleep(5000);
         //List<WebElement> fs = driver.findElements(By.id("email"));
		// sendkeys
		WebElement password = driver.findElement(By.name("pass"));

		password.sendKeys("pandiyan3697");
		// attribute
		String attribute3 = password.getAttribute("name");
		System.out.println(attribute3);

		String attribute4 = password.getAttribute("value");
		System.out.println(attribute4);

		// click

		WebElement login = driver.findElement(By.name("login"));

		// login.click();
		driver.close();
		
		//driver.quit();

		
		
		
		
	}

}

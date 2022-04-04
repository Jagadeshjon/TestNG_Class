package org.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_d15 {
	public WebDriver driver;
//int a= 10;
	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement pass;
	@FindBy(id = "login")
	private WebElement login;

	
	public WebElement getLogin() {
		return login;
	}

	
	public WebElement getPass() {
		return pass;
	}

	public HomePage_d15(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getUsername() {
		return username;
	}

}

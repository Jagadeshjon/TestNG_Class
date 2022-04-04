package org.dress.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page_Dress {
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='login']") private WebElement login;
	
	@FindBy(id = "email") private WebElement email;
	
	@FindBy(id = "passwd") private WebElement password;
	
	@FindBy(id = "SubmitLogin") private WebElement Submit;

	
	public Home_Page_Dress(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getLogin() {
		return login;
	}

	
	public WebElement getEmail() {
		return email;
	}

	
	public WebElement getPassword() {
		return password;
	}

	
	public WebElement getSubmit() {
		return Submit;
	}
	
	
	
	
	

}

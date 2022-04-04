package org.dress.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']") private WebElement Proceed;
	
	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']") private WebElement Proceed1;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]") private WebElement Proceed2;
	
	@FindBy(id = "cgv") private WebElement Agree;
	
	@FindBy(name = "processCarrier") private WebElement Proceed3;
	
	@FindBy(xpath = "//a[@class='bankwire']") private WebElement Payment;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]") private WebElement Confirm;
	
	@FindBy(xpath = "(//a[@rel=\"nofollow\"])[2]") private WebElement Logout;

	
	public Payment_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getProceed() {
		return Proceed;
	}

	
	public WebElement getProceed1() {
		return Proceed1;
	}

	
	public WebElement getProceed2() {
		return Proceed2;
	}

	
	public WebElement getAgree() {
		return Agree;
	}

	
	public WebElement getProceed3() {
		return Proceed3;
	}

	
	public WebElement getPayment() {
		return Payment;
	}

	
	public WebElement getConfirm() {
		return Confirm;
	}

	
	public WebElement getLogout() {
		return Logout;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

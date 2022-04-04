package org.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {

	public WebDriver driver;

	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement select_btn1;

	@FindBy(id = "continue")
	private WebElement continune;

	public Select_hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSelect_btn1() {
		return select_btn1;
	}
	
	public WebElement getContinune() {
		return continune;
	}
}

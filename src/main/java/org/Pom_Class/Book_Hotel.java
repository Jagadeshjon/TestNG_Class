package org.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public Book_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver driver;
	
	@FindBy(xpath="//input[@class='reg_input']") private WebElement firstname;
	@FindBy(xpath="//input[@name='last_name']") private WebElement lastname;
	@FindBy(id="address")private WebElement address;
	@FindBy(xpath="(//input[@class='reg_input'])[3]") private WebElement creditcard_number;
	@FindBy(xpath="//select[@name='cc_type']") private WebElement creditcard_type;
	@FindBy(xpath="(//select[@class='select_combobox2'])[1]") private WebElement Expirydate_M;
	@FindBy(xpath="(//select[@class='select_combobox2'])[2]") private WebElement Expirydate_Y;
	@FindBy(xpath="(//input[@onkeypress='return OnlyNumbersonly(event)'])[2]") private WebElement CVV;
	@FindBy(id="book_now") private WebElement booknow_btn;
	
	public WebElement getFirstname() {
		return firstname;
	}
	
	public WebElement getLastname() {
		return lastname;
	}
	
	public WebElement getAddress() {
		return address;
	}
	
	public WebElement getCreditcard_number() {
		return creditcard_number;
	}
		public WebElement getCreditcard_type() {
		return creditcard_type;
	}
	
	public WebElement getExpirydate_M() {
		return Expirydate_M;
	}
	
	public WebElement getExpirydate_Y() {
		return Expirydate_Y;
	}
	
	public WebElement getCVV() {
		return CVV;
	}
	
	public WebElement getBooknow_btn() {
		return booknow_btn;
	}
	
	
	
	
	
	
	
	
	
	
	

}

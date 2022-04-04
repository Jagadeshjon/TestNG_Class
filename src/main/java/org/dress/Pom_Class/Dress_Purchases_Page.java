package org.dress.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Purchases_Page {
	
	public WebDriver driver;
	
    @FindBy(xpath = "(//a[@title='Dresses'])[2]") private WebElement Dress;
    
    @FindBy(xpath = "(//a[contains(@title,'You are looking for a dress for every day?')])[1]") private WebElement casual;
    
    @FindBy(xpath = "(//input[@type='checkbox'])[3]") private WebElement size;
    
    @FindBy(id = "selectProductSort") private WebElement list;
    
    @FindBy(xpath = "//img[@width='250']") private WebElement img;
    
    @FindBy(name = "Submit") private WebElement Addtochart;

	public Dress_Purchases_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDress() {
		return Dress;
	}

	public WebElement getCasual() {
		return casual;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getList() {
		return list;
	}
	
	public WebElement getImg() {
		return img;
	}

	public WebElement getAddtochart() {
		return Addtochart;
	}
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

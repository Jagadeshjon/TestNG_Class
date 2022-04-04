package org.dress.Pom_Manager;

import org.dress.Pom_Class.Dress_Purchases_Page;
import org.dress.Pom_Class.Home_Page_Dress;
import org.dress.Pom_Class.Payment_Page;
import org.openqa.selenium.WebDriver;

public class Manager_POM {
	
	public WebDriver driver;
	
	private  Home_Page_Dress hp;
	private  Dress_Purchases_Page dpp;
	private  Payment_Page pp;
	
	public Manager_POM(WebDriver driver2) {
		this.driver = driver2;
	}

	public Home_Page_Dress getHp() {
		
		if (hp==null) {
			hp = new Home_Page_Dress(driver);
		}
		
		return hp;
	}
	
	public Dress_Purchases_Page getDpp() {
		if (dpp==null) {
			dpp = new Dress_Purchases_Page(driver);
		}
		return dpp;
	}
	
	public Payment_Page getPp() {
		if (pp==null) {
			pp = new Payment_Page(driver);
		}
		
		return pp;
	}
	
	

}

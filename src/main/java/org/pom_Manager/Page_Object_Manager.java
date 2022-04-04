package org.pom_Manager;

import org.Pom_Class.Book_Hotel;
import org.Pom_Class.Booking_Confirmation;
import org.Pom_Class.HomePage_d15;
import org.Pom_Class.Search_Hotel;
import org.Pom_Class.Select_hotel;
import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {

	public Page_Object_Manager(WebDriver driver2) {
	this.driver = driver2;
	}
	public WebDriver driver;
	private  HomePage_d15 hp;
	private  Search_Hotel sh; 
	private  Select_hotel seh;
	private  Book_Hotel bh;
	private  Booking_Confirmation bcf;
	
	public HomePage_d15 getHp() {
		
		if(hp==null) {
			hp = new HomePage_d15(driver); //Singleton, which if statement is used because to reduce more than one new memory creation for object hp
		}
		return hp;
	}
	public Search_Hotel getSh() {
	 sh = new Search_Hotel(driver);
		return sh;
	}
	
	public Select_hotel getSeh() {
		seh = new Select_hotel(driver);
		return seh;
	}
	
	public Book_Hotel getBh() {
		bh = new Book_Hotel(driver);
		return bh;
	}
	
	public Booking_Confirmation getBcf() {
		bcf = new Booking_Confirmation(driver);
		return bcf;
	}
	
	
	
	
	
	
}

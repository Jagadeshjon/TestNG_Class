package org.Pom_Class;

import java.awt.print.Pageable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public WebDriver driver;

	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(xpath = "(//select[@class='search_combobox'])[3]")
	private WebElement roomtype;
	@FindBy(xpath = "(//select[@class='search_combobox'])[4]")
	private WebElement rooms;
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adult;
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement child;
	@FindBy(id = "Submit")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}

	public Search_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getLocation() {
		return location;
	}

}

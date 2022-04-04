 package org.runnerclass12345;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.Configuration.Helper.File_read_manager;
import org.Pom_Class.Book_Hotel;
import org.Pom_Class.Booking_Confirmation;
import org.Pom_Class.HomePage_d15;
import org.Pom_Class.Search_Hotel;
import org.Pom_Class.Select_hotel;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.baseclass12345.Base_Class_For_All_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pom_Manager.Page_Object_Manager;

public class Runner_class21 extends Base_Class_For_All_Project {

	public static WebDriver driver = browser_configuration("Chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	// public static HomePage_d15 hp = new HomePage_d15(driver);

	// public static Search_Hotel sh = new Search_Hotel(driver);

	// public static Select_hotel seh = new Select_hotel(driver);

	// public static Book_Hotel bh = new Book_Hotel(driver);

	// public static Booking_Confirmation bcf = new Booking_Confirmation(driver);
	
	public static Logger log = Logger.getLogger(Runner_class21.class);

	public static void main(String[] args) throws Throwable {
		
		PropertyConfigurator.configure("log4j.properties");

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\Naveen
		// kumar\\eclipse-workspace\\Maven_Project_Class\\Driver\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver(); `
		// driver.get("https://adactinhotelapp.com/index.php");
		implicitwait();
		String url = File_read_manager.get_FRM().get_CR().get_url();
		
		getUrl(url);
		
		log.info("Url entered");

		implicitwait();

		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// HomePage
		// HomePage_d15 hp = new HomePage_d15(driver);
		// WebElement username = driver.findElement(By.id("username"));
		// username.sendKeys("Jagdishwaran");

		inputValueElement(pom.getHp().getUsername(),Particular_Celldata("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\TestCases.xlsx", 0, 1));

		// WebElement password = driver.findElement(By.id("password"));
		// password.sendKeys("8148981113");

		inputValueElement(pom.getHp().getPass(), Particular_Celldata("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\TestCases.xlsx", 1, 1));

		// WebElement login = driver.findElement(By.id("login"));
		// login.click();

		clickOnElement(pom.getHp().getLogin());

		// Search Hotel class

		// Search_Hotel sh = new Search_Hotel(driver);
		// WebElement location = driver.findElement(By.id("location"));
		// Select s = new Select(location);
		// s.selectByIndex(5);

		dropdown("byIndex", pom.getSh().getLocation(), Particular_Celldata("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\TestCases.xlsx", 2, 1));

		// WebElement hotels = driver.findElement(By.id("hotels"));
		// Select s1 = new Select(hotels);
		// s1.selectByValue("Hotel Sunshine");
		dropdown("byvalue", pom.getSh().getHotels(), Particular_Celldata("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\TestCases.xlsx", 3, 1));

		// WebElement roomtype =
		// driver.findElement(By.xpath("(//select[@class='search_combobox'])[3]"));
		// Select s2 = new Select(roomtype);
		// s2.selectByVisibleText("Super Deluxe");
		dropdown("bytext", pom.getSh().getRoomtype(), Particular_Celldata("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\TestCases.xlsx", 4, 1));

		// WebElement rooms =
		// driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
		// Select s3 = new Select(rooms);
		// s3.selectByValue("2");
		dropdown("byvalue", pom.getSh().getRooms(), Particular_Celldata("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\TestCases.xlsx", 5, 1));

		// WebElement adult =
		// driver.findElement(By.xpath("//select[@name='adult_room']"));
		// Select s4 = new Select(adult);
		// s4.selectByIndex(2);
		dropdown("byIndex", pom.getSh().getAdult(), Particular_Celldata("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\TestCases.xlsx", 6, 1));

		// WebElement child =
		// driver.findElement(By.xpath("//select[@name='child_room']"));
		// Select s5 = new Select(child);
		// s5.selectByIndex(1);
		dropdown("byIndex", pom.getSh().getChild(), Particular_Celldata("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\TestCases.xlsx", 7, 1));

		// WebElement search = driver.findElement(By.id("Submit"));
		// search.click();

		clickOnElement(pom.getSh().getSubmit());

		// Select Hotel
		// Select_hotel seh = new Select_hotel(driver);

		// WebElement clickbutton =
		// driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		// clickbutton.click();

		clickOnElement(pom.getSeh().getSelect_btn1());

		// WebElement con = driver.findElement(By.id("continue"));
		// con.click();

		clickOnElement(pom.getSeh().getContinune());

		// book hotel

		// Book_Hotel bh = new Book_Hotel(driver);
		// WebElement name =
		// driver.findElement(By.xpath("//input[@class='reg_input']"));
		// name.sendKeys("Jaga");
		inputValueElement(pom.getBh().getFirstname(), Particular_Celldata("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\TestCases.xlsx", 8, 1));
		// WebElement last = driver.findElement(By.xpath("//input[@name='last_name']"));
		// last.sendKeys("desh");
		inputValueElement(pom.getBh().getLastname(), Particular_Celldata("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\TestCases.xlsx", 9, 1));
		// WebElement add = driver.findElement(By.id("address"));
		// add.sendKeys("xxxxxxx");
		inputValueElement(pom.getBh().getAddress(), Particular_Celldata("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\TestCases.xlsx", 10, 1));
		// WebElement cr =
		// driver.findElement(By.xpath("(//input[@class='reg_input'])[3]"));
		// cr.sendKeys("2334456623456789");
		inputValueElement(pom.getBh().getCreditcard_number(),"1234567890123456");
		// WebElement crtype =
		// driver.findElement(By.xpath("//select[@name='cc_type']"));
		// Select s10 = new Select(crtype);
		// s10.selectByIndex(3);
		dropdown("byIndex", pom.getBh().getCreditcard_type(), Particular_Celldata("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\TestCases.xlsx", 12, 1));
		// WebElement month =
		// driver.findElement(By.xpath("(//select[@class='select_combobox2'])[1]"));
		// Select s11 = new Select(month);
		// s11.selectByIndex(10);
		dropdown("byIndex", pom.getBh().getExpirydate_M(), Particular_Celldata("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\TestCases.xlsx", 13, 1));
		// WebElement year =
		// driver.findElement(By.xpath("(//select[@class='select_combobox2'])[2]"));
		// Select s12 = new Select(year);
		// s12.selectByIndex(5);
		dropdown("byIndex", pom.getBh().getExpirydate_Y(), Particular_Celldata("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\TestCases.xlsx", 14, 1));
		// WebElement cvv = driver.findElement(By.xpath("(//input[@onkeypress='return
		// OnlyNumbersonly(event)'])[2]"));
		// cvv.sendKeys("123");

		inputValueElement(pom.getBh().getCVV(), Particular_Celldata("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\TestCases.xlsx", 15, 1));

		// WebElement book = driver.findElement(By.id("book_now"));
		clickOnElement(pom.getBh().getBooknow_btn());

		// Booking Confirmation

		// Booking_Confirmation bcf = new Booking_Confirmation(driver);
		// WebElement logout = driver.findElement(By.id("logout"));

		clickOnElement(pom.getBcf().getLogout());

		Thread.sleep(5000);

		// WebElement scroll = driver.findElement(By.id("logout"));
		// Scrollupanddown(scroll);
		// Scrollupanddown(scroll);
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].scrollIntoView();", scroll);
		 */

		takescreenshoot("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\Screenshot\\Adactin.png");

		/*
		 * TakesScreenshot ts = (TakesScreenshot) driver;
		 * 
		 * File source = ts.getScreenshotAs(OutputType.FILE);
		 * 
		 * File destination = new File(
		 * "C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\Screenshot\\MiniProject.png"
		 * );
		 * 
		 * FileUtils.copyFile(source, destination);
		 */
         log.info("Credentials Entered in field");
		cloce();

	}

}

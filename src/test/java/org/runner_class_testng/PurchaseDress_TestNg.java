package org.runner_class_testng;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.Configuration.Helper.Dress.Configration_Reader_Dress;
import org.Configuration.Helper.Dress.File_read_manager_Dress;
import org.apache.commons.io.FileUtils;
import org.baseclass12345.Base_Class_For_All_Project;
import org.dress.Pom_Class.Dress_Purchases_Page;
import org.dress.Pom_Class.Home_Page_Dress;
import org.dress.Pom_Class.Payment_Page;
import org.dress.Pom_Manager.Manager_POM;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class PurchaseDress_TestNg extends Base_Class_For_All_Project {
	
	public static WebDriver driver = browser_configuration("Chrome");
	
	public static Manager_POM mp = new Manager_POM(driver);
	
	//public static Home_Page_Dress hp = new Home_Page_Dress(driver);
	
	//public static Dress_Purchases_Page dpp = new Dress_Purchases_Page(driver);
	
	//public static Payment_Page pp = new Payment_Page(driver);

	//public static void main(String[] args) throws Throwable {
	
	public static ExtentReports reports;
	public static ExtentTest test;
	public static ExtentSparkReporter spark_reporter;
	
	@BeforeTest
	private void Report_Creating() {
		spark_reporter = new ExtentSparkReporter("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\Report_Dress\\Report2.html");
		reports = new ExtentReports();
		reports.attachReporter(spark_reporter);

	}
	
	
	@AfterTest
	private void flush() {
		reports.flush();

	}

	
	
	
	
       @BeforeClass 
       private void browserluncher() throws Throwable {
	   String url = File_read_manager_Dress.get_FRMD().get_CRD().get_url();
	   getUrl(url);
	   implicitwait();
       }
		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\Driver\\chromedriver.exe");

		//WebDriver driver = new ChromeDriver();
		//driver.get("http://automationpractice.com/index.php?id_category=8&controller=category");
		//getUrl("http://automationpractice.com/index.php?id_category=8&controller=category");
		//String url = File_read_manager_Dress.get_FRMD().get_CRD().get_url();
		//getUrl(url);
		//driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//implicitwait();
		
		//Home_Page_Dress hp = new Home_Page_Dress(driver);
		
		//WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
		//login.click();
		@BeforeMethod
		private void Signin() throws Throwable {
			implicitwait();
			clickOnElement(mp.getHp().getLogin());
			
			String email = File_read_manager_Dress.get_FRMD().get_CRD().get_email();
			inputValueElement(mp.getHp().getEmail(), email);
			
			String password = File_read_manager_Dress.get_FRMD().get_CRD().get_password();
			inputValueElement(mp.getHp().getPassword(), password);
			
			clickOnElement(mp.getHp().getSubmit());
		}
		//clickOnElement(mp.getHp().getLogin());

		//WebElement email = driver.findElement(By.id("email"));
		//email.sendKeys("jagadeshjo33@gmail.com");
		//inputValueElement(mp.getHp().getEmail(), "jagadeshjo33@gmail.com");
		//String email = File_read_manager_Dress.get_FRMD().get_CRD().get_email();
		//inputValueElement(mp.getHp().getEmail(), email);

		//WebElement password = driver.findElement(By.id("passwd"));
		//password.sendKeys("jaga1234567890");
		//inputValueElement(mp.getHp().getPassword(), "jaga1234567890");
		//String password = File_read_manager_Dress.get_FRMD().get_CRD().get_password();
		//inputValueElement(mp.getHp().getPassword(), password);

		//WebElement button = driver.findElement(By.id("SubmitLogin"));
		//button.click();
		//clickOnElement(mp.getHp().getSubmit());

		//WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		//dress.click();
		@Test
		private void CasualDress() throws Throwable {
			implicitwait();
			clickOnElement(mp.getDpp().getDress());
			clickOnElement(mp.getDpp().getCasual());
			clickOnElement(mp.getDpp().getSize());
			dropdown("byvalue",mp.getDpp().getList(), "price:desc");
			clickOnElement(mp.getDpp().getImg());
			clickOnElement(mp.getDpp().getAddtochart());
			clickOnElement(mp.getPp().getProceed());
			clickOnElement(mp.getPp().getProceed1());
			clickOnElement(mp.getPp().getProceed2());
			clickOnElement(mp.getPp().getAgree());
			clickOnElement(mp.getPp().getProceed3());
			clickOnElement(mp.getPp().getPayment());
			clickOnElement(mp.getPp().getConfirm());
			takescreenshoot("C:\\\\Users\\\\Naveen kumar\\\\eclipse-workspace\\\\Maven_Project_Class\\\\Screenshot\\\\purchasedemo.png");
			System.out.println("Casual Dress Purchases");

		}
		//clickOnElement(mp.getDpp().getDress());

	//	WebElement casualdress = driver
		//		.findElement(By.xpath("(//a[contains(@title,'You are looking for a dress for every day?')])[1]"));
		//casualdress.click();
		//clickOnElement(mp.getDpp().getCasual());

		//WebElement size = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
		//size.click();
		//clickOnElement(mp.getDpp().getSize());

		//WebElement list = driver.findElement(By.id("selectProductSort"));
		//Select s = new Select(list);
		//s.selectByValue("price:desc");
		//dropdown("byvalue",mp.getDpp().getList(), "price:desc");
		
		//WebElement img = driver.findElement(By.xpath("//img[@width='250']"));
		//img.click();
		//clickOnElement(mp.getDpp().getImg());

		//WebElement addcart = driver.findElement(By.name("Submit"));
		//addcart.click();
		//clickOnElement(mp.getDpp().getAddtochart());
		
		//WebElement proceed = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		//proceed.click();
		//clickOnElement(mp.getPp().getProceed());

		//WebElement proceesd1 = driver
				//.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		//proceesd1.click();
		//clickOnElement(mp.getPp().getProceed1());

		//WebElement proceesd2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		//proceesd2.click();
		//clickOnElement(mp.getPp().getProceed2());

		//WebElement agree = driver.findElement(By.id("cgv"));
		//agree.click();
		//clickOnElement(mp.getPp().getAgree());

		//WebElement proceesd3 = driver.findElement(By.name("processCarrier"));
		//proceesd3.click();
		//clickOnElement(mp.getPp().getProceed3());

		//WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		//payment.click();
		//clickOnElement(mp.getPp().getPayment());
		
		//WebElement confirmorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		//confirmorder.click();
		//clickOnElement(mp.getPp().getConfirm());
         
		//TakesScreenshot ts = (TakesScreenshot) driver;
		//File location = ts.getScreenshotAs(OutputType.FILE);
		//File dest = new File("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\Screenshot\\purchase.png");
        //FileUtils.copyFile(location, dest);
		//takescreenshoot("C:\\\\Users\\\\Naveen kumar\\\\eclipse-workspace\\\\Maven_Project_Class\\\\Screenshot\\\\purchase.png");
		
		@Test
		private void SummerDressDress() throws Throwable {
			implicitwait();
			clickOnElement(mp.getDpp().getDress());
			clickOnElement(mp.getDpp().getCasual());
			clickOnElement(mp.getDpp().getSize());
			dropdown("byvalue",mp.getDpp().getList(), "price:desc");
			clickOnElement(mp.getDpp().getImg());
			clickOnElement(mp.getDpp().getAddtochart());
			clickOnElement(mp.getPp().getProceed());
			clickOnElement(mp.getPp().getProceed1());
			clickOnElement(mp.getPp().getProceed2());
			clickOnElement(mp.getPp().getAgree());
			clickOnElement(mp.getPp().getProceed3());
			clickOnElement(mp.getPp().getPayment());
			clickOnElement(mp.getPp().getConfirm());
			takescreenshoot("C:\\\\Users\\\\Naveen kumar\\\\eclipse-workspace\\\\Maven_Project_Class\\\\Screenshot\\\\purchase1.png");
			System.out.println("Summer Dress Purchases");
		}
		
		@Test
		private void BeachDressDress() throws Throwable {
			implicitwait();
			clickOnElement(mp.getDpp().getDress());
			clickOnElement(mp.getDpp().getCasual());
			clickOnElement(mp.getDpp().getSize());
			dropdown("byvalue",mp.getDpp().getList(), "price:desc");
			clickOnElement(mp.getDpp().getImg());
			clickOnElement(mp.getDpp().getAddtochart());
			clickOnElement(mp.getPp().getProceed());
			clickOnElement(mp.getPp().getProceed1());
			clickOnElement(mp.getPp().getProceed2());
			clickOnElement(mp.getPp().getAgree());
			clickOnElement(mp.getPp().getProceed3());
			clickOnElement(mp.getPp().getPayment());
			clickOnElement(mp.getPp().getConfirm());
			takescreenshoot("C:\\\\Users\\\\Naveen kumar\\\\eclipse-workspace\\\\Maven_Project_Class\\\\Screenshot\\\\purchase2.png");
			System.out.println("Beach Dress Purchases");
		}
		
		@AfterMethod
		private void Logout() {
			clickOnElement(mp.getPp().getLogout());

		}
		
		//WebElement logout = driver.findElement(By.xpath("(//a[@rel=\"nofollow\"])[2]"));
		//clickOnElement(mp.getPp().getLogout());
		@AfterClass
		private void Close1() {
			cloce();

		}
		//cloce();
		
	}



package org.runnerclass12345;

import java.util.concurrent.TimeUnit;

import org.baseclass12345.Base_Class_For_All_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
     
public class Runner_Dress_purchases extends Base_Class_For_All_Project {
	
public static void main(String[] args) {
		
		
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Naveen kumar\\eclipse-workspace\\ProjectClass\\Driver\\chromedriver.exe" );
//	
//       WebDriver driver = new ChromeDriver
	browser_configuration("chrome");
				driver.get("http://automationpractice.com/index.php?id_category=9&controller=category");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement sign = driver.findElement(By.xpath("//a[@class='login'] "));
		sign.click();
		
		WebElement email = driver.findElement(By.xpath("(//input[contains(@class,'is_required validate account_input')])[1]"));
		email.sendKeys("jagadeshjo33@gmail.com");
		
		WebElement button = driver.findElement(By.id("SubmitCreate"));
		button.click();
		
		WebElement titel = driver.findElement(By.xpath("(//input[@type='radio'][1])"));
		
		titel.click();
		
		WebElement firname = driver.findElement(By.xpath("(//input[@class='is_required validate form-control'][1])"));
		firname.sendKeys("Jagadesh");
		
		WebElement lastname = driver.findElement(By.xpath("(//input[contains(@class,'is_required validate form')])[2]"));
		lastname.sendKeys("Tamil King");
		
		WebElement password = driver.findElement(By.xpath("(//input[contains(@class,'is_required validate form')])[4]"));
		password.sendKeys("jaga1234567890");
		
		WebElement date = driver.findElement(By.id("days"));
		
		Select s = new Select(date);
		
		s.selectByValue("3");
		
		WebElement mon = driver.findElement(By.id("months"));
		
		Select s1 = new Select(mon);
		s1.selectByIndex(7);
		
		WebElement year = driver.findElement(By.id("years"));
		
		Select s2 =new Select(year);
		s2.selectByValue("1997");
		
		WebElement tick = driver.findElement(By.id("newsletter"));
		tick.click();
		
		WebElement offer = driver.findElement(By.id("optin"));
		offer.click();
		
		WebElement companyname = driver.findElement(By.id("company"));
		companyname.sendKeys("green tec");
		
		WebElement address = driver.findElement(By.id("address1"));
		
		address.sendKeys("chennai porur");
		
		WebElement address12 = driver.findElement(By.id("address2"));
		address12.sendKeys("guindy");
		
		WebElement city1 = driver.findElement(By.id("city"));
		city1.sendKeys("indian");
		
		WebElement state = driver.findElement(By.xpath("(//select[@class='form-control'])[4]"));
		
		Select s3 = new Select(state);
		s3.selectByValue("5");
		
		WebElement post = driver.findElement(By.id("postcode"));
		post.sendKeys("00000");
		
		WebElement country = driver.findElement(By.xpath("(//select[@class='form-control'])[5]"));
		
		Select s4 = new Select(country);
		s4.selectByValue("21");
		
		WebElement add = driver.findElement(By.id("other"));
		add.sendKeys("alskdhfg");
		
		WebElement ph = driver.findElement(By.id("phone"));
		ph.sendKeys("1234567890");
		
		WebElement ph1 = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
		ph1.sendKeys("0987654321");
		
		WebElement add1 = driver.findElement(By.id("alias"));
		add1.sendKeys("Teynampet");
		
		WebElement re = driver.findElement(By.id("submitAccount"));
		re.click();
		
		
		
	}


}

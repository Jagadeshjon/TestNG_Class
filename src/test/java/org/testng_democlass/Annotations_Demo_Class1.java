package org.testng_democlass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Demo_Class1 {
	@BeforeSuite
	private void Udhaya() {
		
	System.out.println("Java Trainer");	
	}
	@BeforeTest
	private void Snega() {
		System.out.println("Selenium Trainer");
	}
	@BeforeClass
	private void Ashok() {
	 System.out.println("SQL Trainer");

	}
	@BeforeMethod
	private void Suriya() {
	System.out.println("Project Trainer");
	}
	
	@Test
	private void Jaga() {
		System.out.println("Jaga");

	}
	@Test
	private void Pandiyan() {
		System.out.println("Pandiyan");

	}
	@Test
	private void Vicky() {
		System.out.println("Vignesh");
	}
	
	@AfterMethod
	private void Interview() {
		System.out.println("Interview Preparation");

	}
	@AfterClass
	private void Interview1() {
		System.out.println("Interview Attending");
	}
	@AfterTest
	private void Interview2() {
		System.out.println("Interview Selected");

	}
	@AfterSuite
	private void JobJoining() {
		System.out.println("Job Joined in Google");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

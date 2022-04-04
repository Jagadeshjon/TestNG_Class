package org.testng_democlass;
import org.testng.annotations.Test;

public class Invocation_Demo_Class {
	
	
	@Test(priority=-1)
	private void Browser_Lanch() {
		
		System.out.println("Browser lanch");

	}
	@Test
	private void Lanch_Url() {
		
		System.out.println("Lanch Url");

	}
	@Test(invocationCount=3)
	private void refresh() {
		System.out.println("Refresh");

	}

}

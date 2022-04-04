package org.testng_democlass;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency_Demo_Class {

	@Test(dependsOnMethods = "Watch" )
	private void Mobile() {
		System.out.println("mobile");
	}

	@Test
	private void Offer() {
		System.out.println("offer");
	}
	
	@Test
	private void Watch() {
		System.out.println("Watch");

	}

}
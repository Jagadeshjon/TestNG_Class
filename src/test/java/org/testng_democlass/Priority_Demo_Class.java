package org.testng_democlass;

import org.testng.annotations.Test;

public class Priority_Demo_Class {
	
	
	
	@Test(priority =0)
	private void Mcom() {
		System.out.println("M.com passout in 2017");

	}
	@Test(priority=1)
	private void Mphil() {
		System.out.println("M.phil passout in 2019");

	}
	
	@Test(priority=-1)
	 private void Bcom() {
		System.out.println("B.com passout in 2015");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package org.testng_democlass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Demo_Class {
	@Test
	private void username() {
		
		String expected_Username= "palpandiyan ";
		
		String actual_Username="palpandiyan123";
		Assert.assertNotEquals(actual_Username, expected_Username);
		System.out.println("Assert validation");

	}

}

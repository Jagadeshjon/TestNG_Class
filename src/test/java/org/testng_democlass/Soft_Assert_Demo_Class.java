package org.testng_democlass;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Demo_Class {
	@Test
	private void username() {

		String expected_Username = "palpandiyan ";

		String actual_Username = "palpandiyan123";

		SoftAssert soft = new SoftAssert();

		soft.assertEquals(actual_Username, expected_Username);

		System.out.println("Assert verification");

	}

}

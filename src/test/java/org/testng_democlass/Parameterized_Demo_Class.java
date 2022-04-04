package org.testng_democlass;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Demo_Class {

	@Test
	@Parameters({ "username", "password" })
	private void credentaials(String username, String password) {

		System.out.println("username:" + username);

		System.out.println("password:" + password);

	}
}

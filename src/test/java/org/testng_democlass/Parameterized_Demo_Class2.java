package org.testng_democlass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Demo_Class2 {
	@Test
	@Parameters({ "username", "password" })
	private void credentaials( String username,@Optional("Nemo12345") String password) {

		System.out.println("username:" + username);

		System.out.println("password:" + password);

	}

}

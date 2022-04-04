package org.testng_democlass;

import org.testng.annotations.Test;

public class Group_Demo_Class {

	@Test(groups = "Facebook")
	private void Facebook() {
		System.out.println("Facebook Home Page");

	}

	@Test(groups = "Facebook")
	private void WhatsApp() {
		System.out.println("Whatsapp Status");

	}

	@Test
	private void Twitter() {
		System.out.println("Twitter Tending videios");

	}

	@Test
	private void Instagram() {
		System.out.println("Instagram Like Videos");

	}

}
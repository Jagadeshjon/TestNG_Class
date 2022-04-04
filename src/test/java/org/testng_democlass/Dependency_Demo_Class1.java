package org.testng_democlass;
import org.testng.annotations.Test;

public class Dependency_Demo_Class1 {

	@Test
	private void a() {
		System.out.println("A");
	}

	@Test(dependsOnMethods = "c")
	private void b() {

		System.out.println("B");

	}

	@Test
	private void c() {

		System.out.println("C");
	}

	@Test
	private void d() {

		System.out.println("D");

	}

	@Test
	private void e() {

		System.out.println("E");

	}

}

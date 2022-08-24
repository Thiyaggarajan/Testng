package com.testng.TestNG_Concepts;

import org.testng.annotations.Test;

public class GroupTest {
	@Test(groups = "API Test")
	private void postmanTest() {
		System.out.println("postmanTest");	
	}
	@Test(groups = "Functional Test")
	private void seleniumTest() {
		System.out.println("seleniumTest");

	}
	
	@Test(groups = "API Test")
   private void restApiTest() {
	System.out.println("API Test");

}
	@Test(groups = "API Test")
	private void soapTest() {
		System.out.println("Soap test");
	}
	@Test(groups = { "API Test","perfomance test"})
	private void jmeterTest() {
	System.out.println("jmeterTest");

	}

}

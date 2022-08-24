package com.testng.TestNG_Concepts;

import org.testng.annotations.Test;

public class PriorityTest {
	// it will execute depends on ASCII Value
	@Test(priority = 3)
	private void login() {
		System.out.println("login");

	}
	
	@Test(priority = 1)
	private void browserLaunch() {
		System.out.println("Browser Launch");

	}
	
	@Test(priority = 2)
	private void url() {
		System.out.println("url");

	}
	
	
	
	
	
	
	
	

}

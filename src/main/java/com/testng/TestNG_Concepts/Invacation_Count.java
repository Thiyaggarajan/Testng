package com.testng.TestNG_Concepts;

import org.testng.annotations.Test;

public class Invacation_Count {
    
	@Test(invocationCount = 1)
	private void browserLaunch() {
	System.out.println("browserLaunch");

	}
	// this method thats execute how many times you want to perform a test
	@Test(invocationCount = 3)
	private void signin() {
		System.out.println("signin");

	}
	
	
	
	
	
}

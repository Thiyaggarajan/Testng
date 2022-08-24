package com.testng.TestNG_Concepts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	
	@Test
	private void placeOrder() {
		System.out.println("placeOrder");

	}
	//@Test(enabled = false)   or
	@Ignore
	//@Test
	private void orderCancle() {
		System.out.println("orderCancle");

	}
	
	
	

}

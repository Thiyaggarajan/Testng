package com.testng.TestNG_Concepts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Concept {
	
	@Test
	private void validate() {
		String actual= "a";
		String expected = "b";
		
		SoftAssert sa = new SoftAssert();
		
		System.out.println("validaton started");
		sa.assertEquals(actual, expected);
		
		System.out.println("validaton Completed");
		sa.assertAll();

	}

}

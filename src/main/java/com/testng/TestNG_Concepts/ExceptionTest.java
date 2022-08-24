package com.testng.TestNG_Concepts;

import org.testng.annotations.Test;

public class ExceptionTest {
	@Test(expectedExceptions = ArithmeticException.class)
	private void seleniumTest() {
		System.out.println(2/0);
   }
	

}

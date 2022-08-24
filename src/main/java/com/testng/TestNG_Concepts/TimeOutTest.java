package com.testng.TestNG_Concepts;

import org.testng.annotations.Test;

public class TimeOutTest {
	@Test(timeOut = 2000)
	private void singIn() throws InterruptedException {
		
        System.out.println("signin");
	}

}

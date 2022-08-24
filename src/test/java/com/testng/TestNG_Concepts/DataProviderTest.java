package com.testng.TestNG_Concepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@Test(dataProvider = "myDataProvider")
	private void logIn(String username,String Password) {
		System.out.println(username);
		System.out.println(Password);
	}
	@DataProvider
	private Object[][] myDataProvider() {
	   return new Object[][] {
		   {"aaa","111"},
		   {"bbb","222"}
	   

	};
	
	}
}

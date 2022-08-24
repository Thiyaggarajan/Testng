package com.testng.TestNG_Concepts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	@Parameters({"productName","Orderid"})
	@Test
	private void productPurchase(String productName,String Orderid) {
		 System.out.println(productName);
		 System.out.println(Orderid);

	}

}

package com.testng.TestNG_Concepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	public void setup() {
		System.out.println("setup");

	}
	
	@BeforeTest
	public void browserLaunch() {
		System.out.println("browserLaunch");

	}
	@BeforeClass
	public void url() {
		System.out.println("url");

	}
	@BeforeMethod
	public void login() {
		System.out.println("login");

	}
	@Test
	public void searchIndia() {
		System.out.println("searchIndia");

	}
	@Test
	public void searchUSA() {
		System.out.println("searchUSA");

	}
	@AfterMethod
	public void logout() {
		System.out.println("logout");

	}
	@AfterClass
	public void deletAllCookies() {
		System.out.println("deletAllCookies");

	}
	@AfterTest
	public void browserClose() {
		System.out.println("browserClose");

	}
	@AfterSuite
	public void setupClose() {
		System.out.println("setupClose");

	}
	
	
	
	
	

}

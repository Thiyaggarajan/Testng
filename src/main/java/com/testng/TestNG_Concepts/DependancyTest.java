package com.testng.TestNG_Concepts;

import org.testng.annotations.Test;

public class DependancyTest {
	
	@Test(dependsOnMethods = "browserLaunch")
	private void login() {
		System.out.println("login");

	}
	
	@Test(dependsOnMethods = {"url","login","browserLaunch"})
	private void search() {
		System.out.println("search");
	}
	@Test
	private void browserLaunch() {
		System.out.println("Browser Launch");

	}
	
	@Test(dependsOnMethods = "login")
	private void url() {
		System.out.println("url");

	}

	}
	
	



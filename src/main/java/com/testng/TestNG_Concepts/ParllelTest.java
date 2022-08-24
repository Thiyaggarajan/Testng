package com.testng.TestNG_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParllelTest {
	@Test
	private void browserLanunch1() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}
	
	@Test
	private void browserLanunch2() {
		System.setProperty("webdriver.edge.driver", ".\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
	}
	
}

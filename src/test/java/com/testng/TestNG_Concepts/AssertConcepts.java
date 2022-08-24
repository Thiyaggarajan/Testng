package com.testng.TestNG_Concepts;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AssertConcepts {
      @Test
     private void logIn() {
		
    	//expected
	String eptectedText = "T-SHIRTS";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@class='login']")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement Tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
	
	//Actual
	String actualText = Tshirt.getText();

	//validation
     Assert.assertEquals(actualText,eptectedText);
	
     }
}

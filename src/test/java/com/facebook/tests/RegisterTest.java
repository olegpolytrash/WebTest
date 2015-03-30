package com.facebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTestClass {
	
	@BeforeClass
	public void init() {
		standardInit();
	}
	
	@AfterClass
	public void teradown() {
		standardTeardown();
	}
	
	@Test(enabled = true)
	public void runTest() {
		for (WebDriver driver : drivers) {
			driver.get("http://www.facebook.com");
			
			WebElement textBox = driver.findElement(By.cssSelector("#email"));
			textBox.sendKeys("LOLOLOL");
			
			textBox = driver.findElement(By.cssSelector("#email"));
			
		    System.out.println(textBox.getAttribute("value"));
			
			driver.close();
		}
	}
}

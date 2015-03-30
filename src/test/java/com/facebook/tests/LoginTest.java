package com.facebook.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends BaseTestClass {	
	/*@Test(groups={"p1"})
	public void test1() {
		System.out.println("test1");
	}
	@Test(groups={"p1"})
	public void test2() {
		System.out.println("test2");
	}
	@Test(groups={"p2"})
	public void test3() {
		System.out.println("test3");
	}
	@Test(groups={"p2"})
	public void test4() {
		System.out.println("test4");
	}*/
	
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

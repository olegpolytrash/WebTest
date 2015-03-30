package com.facebook.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTestClass {
	protected WebDriver drivers[];

	protected void standardInit() {
		System.setProperty("webdriver.chrome.driver", "/my/chromedriver");
		drivers = new WebDriver[] { new FirefoxDriver(), new ChromeDriver() };
	}
	
	protected void standardTeardown() {
		for (WebDriver driver : drivers) {
			//driver.quit();
		};
	}
}

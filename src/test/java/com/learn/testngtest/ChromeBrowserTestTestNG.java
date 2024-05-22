package com.learn.testngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeBrowserTestTestNG {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void googleSearch() {
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		//driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.quit();
		System.out.println("Test completed successfully.");
	}
}

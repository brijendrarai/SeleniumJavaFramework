package com.learn.headless;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessBrowserDemo {
	
	@Test
	public void test() {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("automatin");
		
		driver.close();
		System.out.println("completed");
	}

}

package com.learn.AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoITDemo {
	
	@Test
	public void test1() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/jpg_to_pdf");
		driver.findElement(By.id("pickfiles")).click();
		Runtime.getRuntime().exec("D:\\uploadautoit.exe");
		Thread.sleep(5000);
	}
	

}

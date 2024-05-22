package com.learn.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
	public static void main(String[] args) {
		//to run test in gecko driver, download driver manually and set path and run tests
		//System.setProperty("webdriver.chrome.driver", "path.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/");
	}
}

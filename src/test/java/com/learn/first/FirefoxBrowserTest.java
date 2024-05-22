package com.learn.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest {
	public static void main(String[] args) {
		//to run test in gecko driver, download driver manually and set path and run tests
		//System.setProperty("webdriver.gecko.driver", "path.exe");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path :"+ projectPath);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/documentation/");
	}
}

package com.learn.desiredcapability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);

		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		//driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
	}

}

package com.learn.first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementLocator {
	public static void main(String[] args) {	
		WebDriver driver  = new ChromeDriver();
		driver.get("https://google.com");
		//WebElement textBox =  driver.findElement(By.id("APjFqb"));
		WebElement textBox = driver.findElement(By.xpath("//input[@id='APjFqb']"));
		textBox.sendKeys("Brijendra Rai");
		textBox.sendKeys(Keys.ENTER);
	}
}

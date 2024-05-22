package com.learn.secondday.pom.design;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	public static WebElement textbox_search(WebDriver driver) {
		WebElement element = driver.findElement(By.name("q"));
		return element;
	}

}

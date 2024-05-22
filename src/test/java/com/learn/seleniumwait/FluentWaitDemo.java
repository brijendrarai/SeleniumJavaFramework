package com.learn.seleniumwait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class FluentWaitDemo {
	
	@Test
	public void test() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("abcd");
		//driver.findElement(By.name("btnk")).sendKeys(Keys.ENTER);
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30)) 
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);

			WebElement element = wait.until(new Function<WebDriver, WebElement>(){
				public WebElement apply(WebDriver driver){
					System.out.println("searching");
					return driver.findElement(By.id("foo"));
				}
			});
	}

}

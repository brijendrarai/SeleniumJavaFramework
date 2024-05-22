package com.learn.testpriority;
import org.testng.annotations.Test;
public class TestNGListenterDemo{
	
	@Test(priority = 1, groups = {"sanity"})
	public void test1() {
		System.out.println("I am inside test1");
	}
	
	@Test(priority = 1, groups = {"sanity", "smoke"})
	public void test2() {
		System.out.println("I am inside test2");
	}
	
	@Test(priority = 1, groups = {"sanity", "regression"})
	public void test3() {
		System.out.println("I am inside test3");
	}
}

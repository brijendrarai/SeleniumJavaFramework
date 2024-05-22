package com.learn.retryfailedtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learn.listeners.MyRetry;

public class RetryFailedTestDemo {
	
	@Test
	public void test1() {
		System.out.println("i am inside test1");
	}
	
	@Test(retryAnalyzer = MyRetry.class)
	public void test2() {
		System.out.println("i am inside test2");
		int i = 1/0;
	}
	
	@Test
	public void test3() {
		System.out.println("i am inside test3");
		//Assert.assertTrue(false);
	}
}

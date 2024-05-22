package com.learn.listeners;

import static org.testng.Assert.assertEquals;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGItestListeners.class)
public class TestNGListenterDemo {
	
	@Test
	public void test1() {
		System.out.println("I am inside test1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside test2");
		assertEquals(false, true);
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside test3");
		throw new SkipException("Skipped due to parent test failure");
	}
	
	

}

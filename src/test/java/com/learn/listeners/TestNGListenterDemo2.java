package com.learn.listeners;

import static org.testng.Assert.assertEquals;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGItestListeners.class)
public class TestNGListenterDemo2 {
	
	@Test
	public void test4() {
		System.out.println("I am inside test4");
	}
	
	@Test
	public void test5() {
		System.out.println("I am inside test5");
		assertEquals(false, true);
	}
	
	@Test
	public void test6() {
		System.out.println("I am inside test6");
		throw new SkipException("Skipped due to parent test failure");
	}
	
	

}

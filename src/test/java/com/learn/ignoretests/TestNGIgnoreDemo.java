package com.learn.ignoretests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore //ignore all the tests from one class
public class TestNGIgnoreDemo {
	
	@Ignore
	@Test
	public void test1() {
		System.out.println("i am inside test1");
	}
	
	@Test
	public void test2() {
		System.out.println("i am inside test2");
	}

}

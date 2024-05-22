package com.learn.dependency;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	@Test(priority = 2)
	public void test1() {
		System.out.println("i am inside test1");
		assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"test1","test3"}, priority = 1)
	public void test2() {
		System.out.println("i am inside test2");
	}
	
	@Test
	public void test3() {
		System.out.println("i am inside test3");
		assertTrue(false);
	}

}

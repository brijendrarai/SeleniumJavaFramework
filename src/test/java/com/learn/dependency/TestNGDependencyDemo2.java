package com.learn.dependency;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestNGDependencyDemo2 {
	
	@Test(groups = "sanity2")
	public void test1() {
		System.out.println("i am inside test1");
		//assertTrue(false);
	}
	
	@Test(dependsOnGroups = {"sanity1","sanity2"})
	public void test2() {
		System.out.println("i am inside test2");
	}
	
	@Test(groups = "sanity1")
	public void test3() {
		System.out.println("i am inside test3");
		assertTrue(false);
	}

}

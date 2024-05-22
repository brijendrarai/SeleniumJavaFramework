package com.learn.testngparameterize;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterizeDemo {
	
	@Test
	@Parameters("Name")
	public void test(@Optional("Brij") String name) {
		System.out.println("name is: "+ name);
	}
}

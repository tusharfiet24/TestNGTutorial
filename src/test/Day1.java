package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	@Test
	public void demo() {
		System.out.println("Tushar");
		Assert.assertTrue(false);
	}
	
	@AfterTest
	public void afterTest() {
		//Appium
		System.out.println("I'll execute last");
	}
	
	@Test
	public void firstTest() {
		System.out.println("Hello");
	}
	
	@Test
	public void secondTest() {
		System.out.println("World");
	}
}

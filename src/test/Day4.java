package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day4 {
	@Test
	public void webLoginHomeLogin() {
		//Selenium
		System.out.println("webloginhome");
	}
	
	@BeforeTest
	public void beforeTest() {
		//Appium
		System.out.println("I'll execute first");
	}
	
	@Test(groups= {"Smoke"})
	public void mobileLoginHomeLogin() {
		//Appium
		System.out.println("mobileloginhome");
	}
	
	@Test
	public void loginAPIhomeLoan() {
		//Rest API automation
		System.out.println("apiloginhome");
	}
}

package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {
//	TestNG Helper Attributes -> dependsOnMethods, enabled, timeOut.
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before executing any method in the class");
	}
	
	@Test
	public void webLoginCarLogin() {
		//Selenium
		System.out.println("weblogincar");
	}
	
	@Test(groups= {"Smoke"})
	public void mobileLoginCarLogin() {
		//Appium
		System.out.println("mobilelogincar");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		//Appium
		System.out.println("I'll execute Before test suite");
	}
	
	@Test(enabled=false)
	public void mobileSignInCarLogin() {
		//Appium
		System.out.println("mobilesignincar");
	}
	
	@Test(timeOut=4000)
	public void mobileSignOutCarLogin() throws InterruptedException {
		//Appium
		Thread.sleep(3000);
		System.out.println("mobilesignoutcar");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		//Appium
		System.out.println("I'll execute before every method in Day3 class");
	}
	
	@Test(dependsOnMethods={"mobileSignOutCarLogin", "webLoginCarLogin",})
	public void APIcarLoan() {
		//Rest API automation
		System.out.println("apilogincar");
	}
	
	@AfterMethod
	public void afterMethod() {
		//Appium
		System.out.println("I'll execute after every method in Day3 class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Before executing all methods in the class");
	}
}

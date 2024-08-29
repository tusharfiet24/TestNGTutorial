package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Day2 {
//	Annotations execution order-
//	@BeforeSuite -> @BeforeTest -> @BeforeClass -> @BeforeMethod -> @Test -> @AfterMethod -> @AfterClass
//	-> @AfterTest -> @AfterSuite
	
//  XML Level -> @BeforeSuite, @AfterSuite, @BeforeTest, @AfterTest
//  Class Level -> @BeforeClass, @AfterClass, @BeforeMethod, @AfterMethod

	@Test
	public void pLoan() {
		System.out.println("Personal Loan");
	}
	
	@AfterSuite
	public void beforeSuite() {
		//Appium
		System.out.println("I'll execute After test suite");
	}
}

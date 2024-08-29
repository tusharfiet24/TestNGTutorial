package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
//	TestNG Helper Attributes -> dependsOnMethods, enabled, timeOut.

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before executing any method in the class");
	}

	@Parameters({ "URL", "APIKey/username" })
	@Test
	public void webLoginCarLogin(String urlname, String key) {
		// Selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}

	@Test(groups = { "Smoke" })
	public void mobileLoginCarLogin() {
		// Appium
		System.out.println("mobilelogincar");
	}

	@BeforeSuite
	public void beforeSuite() {
		// Appium
		System.out.println("I'll execute Before test suite");
	}

	@Test(enabled = false)
	public void mobileSignInCarLogin() {
		// Appium
		System.out.println("mobilesignincar");
	}

	@Test(timeOut = 4000, dataProvider = "getData")
	public void mobileSignOutCarLogin(String username, String password) throws InterruptedException {
		// Appium
		Thread.sleep(3000);
		System.out.println("mobilesignoutcar");
		System.out.println(username);
		System.out.println(password);
	}

	@BeforeMethod
	public void beforeMethod() {
		// Appium
		System.out.println("I'll execute before every method in Day3 class");
	}

	@Test(dependsOnMethods = { "mobileSignOutCarLogin", "webLoginCarLogin", })
	public void APIcarLoan() {
		// Rest API automation
		System.out.println("apilogincar");
	}

	@AfterMethod
	public void afterMethod() {
		// Appium
		System.out.println("I'll execute after every method in Day3 class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Before executing all methods in the class");
	}

	@DataProvider
	public Object[][] getData() {
		// 1st combination - username password - good credit history = row
		// 2nd - username password - no credit history
		// 3rd - fraudelent credit history
//		Object[][] data = new Object[3][2];
//		//1st set
//		data[0][0] = "firstsetusername";
//		data[0][1] = "password";
//		//columns in the row are nothing but values for that particular combination(row)
//		
//		//2nd set
//		data[1][0] = "secondsetusername";
//		data[1][1] = "password";
//		
//		//3rd set
//		data[2][0] = "thirdsetusername";
//		data[2][1] = "password";

		Object[][] data = { { "firstsetusername", "password" }, { "secondsetusername", "password" },
				{ "thirdsetusername", "password" } };

		return data;
	}
}

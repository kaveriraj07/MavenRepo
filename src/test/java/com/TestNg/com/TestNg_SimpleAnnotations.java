package com.TestNg.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_SimpleAnnotations {
	
	@BeforeSuite
	public void setup() {
		System.out.println("Setting Browser");

	}
	@BeforeTest
 public void browserLaunch() {
	System.out.println("LaunchBrowser");

}
	@BeforeClass
	public void launchUrl() {
		System.out.println("launch URL");

	}
	@BeforeMethod
	public void login() {
		System.out.println("login");
	}
	
	@Test
	public void searchMobile() {
		System.out.println("search Iphoe");

	}
	@AfterMethod
	public void verify() {
System.out.println("verify Test Result");
	}
@AfterClass
	public void logout() {
		System.out.println("logoout");
		

	}
@AfterTest
public void closeBrowser() {
	System.out.println("close Broswer");

}
@AfterSuite
private void deletecookies() {
	System.out.println("delete cookied");

}
	}



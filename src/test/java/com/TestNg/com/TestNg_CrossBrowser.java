package com.TestNg.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class TestNg_CrossBrowser {	
	@Parameters("Browser")
	@BeforeClass
	public void beforeLoginTest(String Browser) {		
		if(Browser.equalsIgnoreCase("chrome"))			
		{
			
			System.out.println("chrome Browser");
		}
		
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			System.out.println("firefox browser");
		}
	}
	
	@Test
public void loginTest() {
	
	System.out.println("login");
	
}
	@AfterClass
	public void afterLoginTest() {
		System.out.println("close Browser");

	}
}

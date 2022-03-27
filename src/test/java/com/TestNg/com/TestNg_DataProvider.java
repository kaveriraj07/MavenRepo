package com.TestNg.com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNg_DataProvider {

	@Test(dataProvider = "testdata")
	public void methodData1(String username,String password) {
		
		System.out.println("user name is  "+ username + " password id + " + password);
	}
	
	@DataProvider(name ="testdata")
	public Object[][] testdata(){
		
		return new Object[][]
				{
			
			{"abc","123"},{"def","456"},{"ghi","789"}
			
				};
				}
}

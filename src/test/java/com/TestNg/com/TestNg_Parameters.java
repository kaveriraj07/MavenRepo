package com.TestNg.com;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_Parameters {
	
	@Parameters({"Username"})
	@Test
	public void methodData1(@Optional("iniyan") String username) {
		System.out.println("username is =" + username);

	}
	
	@Parameters({"password"})
	@Test
public void methodData2(String password) {
	System.out.println("password is =" + password);

}
}

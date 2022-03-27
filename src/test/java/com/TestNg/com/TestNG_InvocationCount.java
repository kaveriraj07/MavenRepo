package com.TestNg.com;

import org.testng.annotations.Test;

public class TestNG_InvocationCount {
	
	@Test
	public void aMethod() {
		System.out.println("A method");

	}
	@Test(invocationCount = 3)
private void bMethod() {
	System.out.println(" B method");

}
}

package com.TestNg.com;

import org.testng.annotations.Test;

public class TestNG_ExpectedException {
	@Test(expectedExceptions = ArithmeticException.class)
	public void aMethod() {
		
		int a= 50/0;
		System.out.println("A method");

	}
	@Test
public void bMethod() {
	System.out.println("B method");

}
}

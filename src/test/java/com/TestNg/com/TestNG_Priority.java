package com.TestNg.com;

import org.testng.annotations.Test;

public class TestNG_Priority {
	
	@Test(priority=2)
	public void aMethod() {
		System.out.println("A method");

	}
@Test(priority=3)
		public void bMethod() {
			System.out.println("B method");

		}
@Test(priority = 1)
public void cMethod() {
	System.out.println("C method");

}
}
